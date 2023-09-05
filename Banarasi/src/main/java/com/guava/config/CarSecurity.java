package com.guava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CarSecurity
{
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
    {
//        ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)http.authorizeHttpRequests().anyRequest()).authenticated();
//        http.formLogin();
//        http.httpBasic();
//        return (SecurityFilterChain)http.build();

        http.authorizeHttpRequests()
                .requestMatchers("/car/test").permitAll()
                .requestMatchers("/car").authenticated().
                and().formLogin()
                .and().httpBasic();

        return http.build();


    }
}
