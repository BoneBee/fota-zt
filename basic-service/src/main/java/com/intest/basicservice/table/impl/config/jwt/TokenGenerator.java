package com.intest.basicservice.table.impl.config.jwt;

import org.springframework.stereotype.Component;

@Component
public interface TokenGenerator {
    public String generate(String... strings);

}
