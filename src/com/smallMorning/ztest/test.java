package com.smallMorning.ztest;

public class test {



    public static void changePeople(People p){
        p.age+=10;
    }

    public static void changAge(int age){
        age+=10;
    }

    public static void main(String[] args){
        People p = new People("test",10);
        System.out.println(p.age);
        test.changePeople(p);
        System.out.println(p.age);
        test.changAge(p.age);
        System.out.println(p.age);
    }
}
class People{
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {
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