/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.templates.co.HTTPSTemplate.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Guest
 */

@Configuration
public class SecurityConfig {

    //This config is only for development porpuses.
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .requiresChannel(channel
                        -> channel.anyRequest().requiresSecure())
                .authorizeRequests(authorize
                        -> authorize.anyRequest().permitAll())
                .build();
    }
}
