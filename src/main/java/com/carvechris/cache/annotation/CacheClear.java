package com.carvechris.cache.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.carvechris.cache.parser.IKeyGenerator;
import com.carvechris.cache.parser.impl.DefaultKeyGenerator;

/**
 * 解决问题：
 *
 * @author
 * @version 1.0
 * @date 2017年5月4日
 * @since 1.7
 */
@Retention(RetentionPolicy.RUNTIME)//在运行时可以获取  
@Target(value = {ElementType.METHOD, ElementType.TYPE})//作用到类，方法，接口上等
public @interface CacheClear {
    /**
     * 缓存key的前缀
     *
     * @return
     * @author
     * @date 2017年5月3日
     */
    public String pre() default "";

    /**
     * 缓存key
     *
     * @return
     * @author
     * @date 2017年5月3日
     */
    public String key() default "";

    /**
     * 缓存keys
     *
     * @return
     * @author
     * @date 2017年5月3日
     */
    public String[] keys() default "";

    /**
     * 键值解析类
     *
     * @return
     */
    public Class<? extends IKeyGenerator> generator() default DefaultKeyGenerator.class;
}
