package com.smallMorning.ztest;

import java.util.ArrayList;
import java.util.List;

/**
*@Author zheng zs
*@Date 20:51 2020/10/21
*@Description 泛型测试1
**/
public class TestGenetic1 {

    private static <T extends Number> void add(T a ,T b){
        //用泛型实现多种数据类型的假发貌似并没有省多少代码
        if(a.getClass()==Integer.class&&b.getClass()==Integer.class){
            System.out.println("Integer     "+a+"+"+b+"="+(a.intValue()+b.intValue()));
        }else if(a.getClass()==Double.class&&b.getClass()==Double.class){
            System.out.println("Double     "+a+"+"+b+"="+(a.doubleValue()+b.doubleValue()));
        }else{
            System.out.println("不提供计算！");
        }
    }
    public static void main(String args[]){
        /*List<b> list= new ArrayList<>(); //正确写法
        //List<> list2= new ArrayList<b>(); //这种写法会报错 受检异常 idea直接报错
        //List<b> list3= new ArrayList<b>(); //可以但没必要
        a A = new a();
        b B = new b();
        c C = new c();
        list.add(B);//没使用通配符的话只能使用确定的类名来实例化*/
        add(1,2);
        add(1,2.2);
    }
}
class a{
}
class b extends a{
}
class c extends b{

}