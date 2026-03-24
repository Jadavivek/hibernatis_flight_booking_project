package com.example.college.config;

import com.example.college.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final UserRepository repo;

    public SecurityConfig(UserRepository repo) {
        this.repo = repo;
    }

    // 🔥 Load user from DB
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> repo.findByUsername(username)
                .map(user -> User.withUsername(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRole()) // ADMIN / USER
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    // 🔥 Security Rules
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable()) // disable for simplicity

            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/register", "/saveUser", "/css/**").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/user/**").hasRole("USER")
                .anyRequest().authenticated()
            )

            .formLogin(form -> form
                .loginPage("/login")              // custom login page
                .defaultSuccessUrl("/dashboard", true)
                .permitAll()
            )

            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            );

        return http.build();
    }

    // 🔥 Password Encoder
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
