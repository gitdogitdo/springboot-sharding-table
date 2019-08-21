package com.xd.shardingtable.constant;

/**
 * @author wind_
 * @date 2019/6/30
 */
public interface CommonConstants {
    /**
     * UTF-8
     */
    String CHARACTER_SET_UTF8 = "UTF-8";

    /**
     * base64编码用户ID盐
     */
    String USER_TOKEN_KEY = "==#UnV@o(O@O0)Y^=[@C7&yc$jgX]cc!";

    /**
     * redis中存用户信息key的前缀
     */
    String REDIS_USER_KEY_PREFIX = "svu_";

    /**
     * redis keys [*]的统配
     */
    String REDIS_KEYS_PATTERN_ALL = "*";

    /**
     * 用户过期时间
     */
    int USER_EXPIRE_TIME = 99999;
}
