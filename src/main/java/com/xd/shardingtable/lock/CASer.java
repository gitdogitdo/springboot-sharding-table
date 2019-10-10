package com.xd.shardingtable.lock;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @Author: Dokit
 * @Date: 2019/8/22 14:17
 */
public class CASer {

    // 真实值
    private volatile int realValue;
    // 获取当前值
    public int get(){
        return realValue;
    }

    // 自增指定值并获取自增后的值
    public synchronized int addAndGet(int increment){
        // 不断CAS 直到更新成功
        while(true){
            int expectedValue = get();
            int newValue = expectedValue +increment;
            if(compareAndSwap(expectedValue,newValue)){
                return newValue;
            }
        }
    }

    /**
     *
     * @param expectedValue  预估值
     * @param newValue  更新值
     * @return
     */
    private synchronized boolean compareAndSwap(int expectedValue,int newValue){
        // 将预估值与真实值比较，如果一样则将更新值给真实值
        if(expectedValue == realValue){
            realValue = newValue;
            return true;
        }
        return false;
    }

}
