package com.intest.basicservice.table.config.jwt;

import com.intest.basicservice.table.config.jwt.TokenGenerator;
import com.intest.basicservice.user.util.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BcrptTokenGenerator implements TokenGenerator {

    @Override
    public String generate(String... strings) {
        long   timestamp = System.currentTimeMillis();
        String tokenMeta = "";
        for (String s : strings) {
            tokenMeta = tokenMeta + s;
        }
        tokenMeta = tokenMeta + timestamp;
        String token = BCrypt.hashpw(tokenMeta,  BCrypt.gensalt());
        return token;
    }
}
