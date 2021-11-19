package com.tencent.ciam.samples.springboot.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author figozhang
 */
@Configuration(proxyBeanMethods = false)
public class DemoWebAppSecurityConfig {

    @Configuration(proxyBeanMethods = false)
    @EnableWebSecurity
    public static class DemoWebAppSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/webjars/**");
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests(authorizeRequests ->
                    authorizeRequests.anyRequest().authenticated()
                )
                .oauth2Login(oauth2Login ->
                    oauth2Login.loginPage("/oauth2/authorization/default_client"))
                .oauth2Client(withDefaults())
                .formLogin(withDefaults());
        }

    }

}
