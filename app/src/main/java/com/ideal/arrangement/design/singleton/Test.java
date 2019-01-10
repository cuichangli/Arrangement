package com.ideal.arrangement.design.singleton;

/**
 * 创建者     ideal
 * 创建时间   2019/1/9 17:11
 * 描述	     测试单例模式
 * 实现单例模式主要有如下几个关键点：
 * 1.构造函数不对外开放，一般为private.
 * 2.通过一个静态方法或者美剧返回但李磊对象
 * 3.确保单例类的对象有且只有一个，尤其是在多线程环境下
 * 4.确保单例类对象在反序列化是不会重新构建对象。
 * 通过将但李磊的构造函数私有化，是的客户端代码不能通过new的形势手动构造单例类的对象。
 * 单例类会暴露一个公有静态方法，客户端需要调用这个静态方法获取到单例类的唯一对象，
 * 在获取这个单例对象的过程中需要确保线程安全，即在多线程环境下构造单例类的队形也是有且只有一个，这也是单例模式实现中比较困难的地方。
 */
public class Test {
    public static void main(String[] args) {
        //1.正式应用的单例模式
        Singleton.getInstance().doSomething();

        //2.测试用例
        Company company = new Company();
        //CEO对象只能通过getCeo函数获取
        Staff ceo1 = Staff.geCeo();
        Staff ceo2 = Staff.geCeo();
        Staff ceo3 = Staff.geCeo();
        Staff ceo4 = Staff.geCeo();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        company.addStaff(ceo3);
        company.addStaff(ceo4);
        company.ShowAllStaqffs();


    }
    /**
     * 显示结果：
     * Obj:com.ideal.arrangement.design.singleton.CEO@74a14482
     * Obj:com.ideal.arrangement.design.singleton.CEO@74a14482
     * Obj:com.ideal.arrangement.design.singleton.CEO@74a14482
     * Obj:com.ideal.arrangement.design.singleton.CEO@74a14482
     */
}
