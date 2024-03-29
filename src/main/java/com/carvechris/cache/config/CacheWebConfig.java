package com.carvechris.cache.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration("cacheWebConfig")
public class CacheWebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/cache/**").addResourceLocations(
                "classpath:/META-INF/static/");
        super.addResourceHandlers(registry);
    }
}
