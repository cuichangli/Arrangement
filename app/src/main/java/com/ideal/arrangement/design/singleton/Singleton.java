package com.ideal.arrangement.design.singleton;

/**
 * 创建者     ideal
 * 创建时间   2019/1/9 17:49
 * 描述	     Double  Check Lock 模式
 * 更新描述  正式使用场景
 */
public class Singleton {
    private static Singleton mSingleton = null;
    private static Singleton inStance;

    public static Singleton getInstance() {
        if (inStance == null) {
            synchronized (Singleton.class) {
                if (inStance == null) {
                    inStance = new Singleton();
                }
            }
        }
        return inStance;
    }

    public void doSomething() {
        System.out.println("正式应用的单例模式------>双重验证模式:Singleton");
    }


}
