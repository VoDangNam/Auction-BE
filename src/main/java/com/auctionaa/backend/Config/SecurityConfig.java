package com.auctionaa.backend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable CSRF theo cú pháp mới
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/register", "/api/auth/register",
                                "/featured",
                                "/all",
                                "/upload",
                                "/addInvoice","/getListInvoice",
                                "/owner/{ownerid}",
                                "invoice/{ownerid}",
                                "/api/notification/**"
                        ).permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}
