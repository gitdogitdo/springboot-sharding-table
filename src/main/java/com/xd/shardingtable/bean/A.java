package com.xd.shardingtable.bean;

/**
 * @Author: Dokit
 * @Date: 2019/8/21 19:35
 */
public abstract class A{
    /**
     * 如果一个类里面又抽象方法那么这个类是抽象类
     */
    //接口里定义的变量只能是公共的静态的常量，抽象类中的变量是普通变量。
    private String name;

    public abstract void sing();


}
