package com.intest.common.webcore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author zhanghui
 * @create 2020-08-27 21:28
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher matcher = new AntPathMatcher();
        // path 不区分大小写
        matcher.setCaseSensitive(false);
        configurer.setPathMatcher(matcher);
    }
}
