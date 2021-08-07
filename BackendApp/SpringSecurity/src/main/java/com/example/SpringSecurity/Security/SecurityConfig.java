package com.example.SpringSecurity.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
                        http
                                .authorizeRequests()
                                .anyRequest()
                                .authenticated()
                                .and()
                                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails MaxMustermann = User.builder()
                                    .username("MaxMustermann")
                                    .password(passwordEncoder.encode("password"))
                                    .roles(ApplicationUserRoles.STUDENT.name())
                                    .build();

        UserDetails AnnaMustermann = User.builder().username("AnnaMustermann")
                                        .password(passwordEncoder.encode("HelloWorld"))
                                        .roles(ApplicationUserRoles.ADMIN.name())
                                        .build();
        return new InMemoryUserDetailsManager(MaxMustermann, AnnaMustermann);
    }
    //hello
}