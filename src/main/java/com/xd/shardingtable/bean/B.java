package com.xd.shardingtable.bean;

/**
 * @Author: Dokit
 * @Date: 2019/8/21 19:36
 */
public class B extends A{
    /**
     * 如果一个类继承了抽象类,那么这个类必须重写抽象类的所有抽象方法
     */
    @Override
    public void sing() {
        System.out.println("我会唱歌吗");
    }
}
