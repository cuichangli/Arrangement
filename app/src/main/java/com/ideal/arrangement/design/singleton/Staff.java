package com.ideal.arrangement.design.singleton;

/**
 * 创建者     ideal
 * 创建时间   2019/1/9 17:03
 * 描述	    CEO 懒汉单例模式
 * 更新描述   $$$$
 */
public class Staff {
    private static final Staff mCeo = new Staff();

    /**
     * 构造函数，私有
     */
    public Staff() {
    }

    /**
     * 公有的静态函数，对外暴露获取单例对象的接口
     *
     * @return
     */
    public static Staff geCeo() {
        return mCeo;
    }


    public void Work() {
        System.out.println("管理Vp(副总裁)");
    }
}
