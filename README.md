@Bean
public UserDetailsService userDetailsService() {
    return username -> repo.findByUsername(username)
            .map(user -> org.springframework.security.core.userdetails.User
                    .withUsername(user.getUsername())
                    .password(user.getPassword())
                    .roles(user.getRole())
                    .build())
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
}
