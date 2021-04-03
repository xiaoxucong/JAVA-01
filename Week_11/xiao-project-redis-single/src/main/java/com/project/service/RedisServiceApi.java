package com.project.service;


public interface RedisServiceApi {


    /**
     * 尝试获取分布式锁
     *
     * @param key       键
     * @param requestId 请求ID
     * @param expire    锁的有效时间（秒）
     */
    public  Boolean tryLock(String key, String requestId, long expire);
    /**
     * 释放分布式锁
     *
     * @param key       键
     * @param requestId 请求ID
     */
    public Boolean releaseLock(String key, String requestId);

    public Long getNum(String key,Long value);
}
