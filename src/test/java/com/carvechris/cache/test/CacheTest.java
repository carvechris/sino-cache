package com.carvechris.cache.test;

import com.carvechris.cache.EnableIfsCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ifs on 2017/5/21.
 */
@SpringBootApplication
@EnableIfsCache
public class CacheTest {
    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(CacheTest.class);
        app.run(args);
    }

}
