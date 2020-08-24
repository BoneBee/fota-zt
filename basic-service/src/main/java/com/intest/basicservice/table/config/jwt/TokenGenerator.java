package com.intest.basicservice.table.config.jwt;

import org.springframework.stereotype.Component;

@Component
public interface TokenGenerator {
    public String generate(String... strings);

}
