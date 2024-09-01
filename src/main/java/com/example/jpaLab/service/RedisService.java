package com.example.jpaLab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveData(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getData(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void deleteData(String key) {
        redisTemplate.delete(key);
    }

    public Map<Object, Object> getAllHash(String hashKey) {
        return redisTemplate.opsForHash().entries(hashKey);
    }

    public void saveToHash(String hashKey, Object key, Object value) {
        redisTemplate.opsForHash().put(hashKey, key, value);
    }

    public void deleteFromHash(String hashKey, Object key) {
        redisTemplate.opsForHash().delete(hashKey, key);
    }
}

