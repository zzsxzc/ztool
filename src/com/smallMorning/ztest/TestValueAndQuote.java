package com.smallMorning.ztest;
/**
*@Author zheng zs
*@Date 14:26 2020/11/24
*@Description 传值与传引用 static与final
**/
public class TestValueAndQuote {

    public static void main(String[] args) {
        Person person = new Person("小丽",10);
        int testValue = 10;
        changeQuote(person);
        changeValue(testValue);
        System.out.println(person.getName());
        System.out.println(testValue);
    }
    private static void changeValue(int value){
        value =100;
    }

    private static void changeQuote(Person p){
        p.setName("名字被修改啦！");
        p.setAge(100);
        p = new Person("一个新人",11);
    }



}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
