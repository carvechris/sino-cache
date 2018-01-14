package com.ace.cache.test.cache;

import com.carvechris.cache.constants.CacheScope;
import com.carvechris.cache.parser.IKeyGenerator;
import com.carvechris.cache.parser.IUserKeyGenerator;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-05-22 14:05
 */
public class MyKeyGenerator extends IKeyGenerator {
    @Override
    public IUserKeyGenerator getUserKeyGenerator() {
        return null;
    }

    @Override
    public String buildKey(String key, CacheScope scope, Class<?>[] parameterTypes, Object[] arguments) {
        return "myKey_"+arguments[0];
    }
}
