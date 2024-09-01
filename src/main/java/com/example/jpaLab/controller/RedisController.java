package com.example.jpaLab.controller;

import com.example.jpaLab.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public String saveData(@RequestParam String key, @RequestParam String value) {
        redisService.saveData(key, value);
        return "Data saved successfully!";
    }

    @GetMapping("/{key}")
    public Object getData(@PathVariable String key) {
        return redisService.getData(key);
    }

    @DeleteMapping("/delete/{key}")
    public String deleteData(@PathVariable String key) {
        redisService.deleteData(key);
        return "Data deleted successfully!";
    }

    @GetMapping("/hash/{hashKey}")
    public Map<Object, Object> getAllHash(@PathVariable String hashKey) {
        return redisService.getAllHash(hashKey);
    }

    @PostMapping("/hash/save")
    public String saveToHash(@RequestParam String hashKey, @RequestParam String key, @RequestParam String value) {
        redisService.saveToHash(hashKey, key, value);
        return "Data saved to hash successfully!";
    }

    @DeleteMapping("/hash/delete")
    public String deleteFromHash(@RequestParam String hashKey, @RequestParam String key) {
        redisService.deleteFromHash(hashKey, key);
        return "Data deleted from hash successfully!";
    }
}

