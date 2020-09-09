package com.intest.common.jwt.shiro.cache;

import com.intest.common.jwt.shiro.cache.CustomCache;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zhanghui
 * @create 2020-08-26 20:36
 */
public class CustomCacheManager implements CacheManager {

    private RedisTemplate<String, Object> redisTemplate;

    public CustomCacheManager(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return new CustomCache<K, V>(redisTemplate);
    }
}
