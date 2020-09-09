package com.intest.common.jwt.shiro;

import com.intest.common.jwt.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanghui
 * @create 2020-08-27 1:34
 */
@Configuration
public class ShiroFilterRegisterConfig {
    @Bean
    public FilterRegistrationBean shiroLoginFilteRegistration(JwtFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }


    @Bean
    public FilterRegistrationBean shiroRolesFilterRegistration(JwtFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }
    @Bean
    public FilterRegistrationBean shiroPermsFilterRegistration(JwtFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }

    @Bean
    public FilterRegistrationBean kickoutSessionFilterRegistration(JwtFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }
}
