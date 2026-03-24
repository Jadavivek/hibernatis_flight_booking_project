package com.example.college.config;

import com.example.college.repository.UserRepository;
import org.springframework.context.annotation.*;
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

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> repo.findByUsername(username)
                .map(user -> User.withUsername(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRole())
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/register", "/saveUser").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/user/**").hasRole("USER")
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .defaultSuccessUrl("/dashboard", true)
            )
            .logout(logout -> logout.logoutSuccessUrl("/login"));

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
