package com.smallMorning.ztool.code;

import java.util.*;

/**
*@Author zheng zs
*@Date 21:34 2020/10/1
*@Description Code 生成器(泛意义 包含密码、邀请码，可以自定义随机方式)
**/
public class CodeProducer {
    char[] space = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
    //静态方法慎用 以后研究question
    //生成指定长度的，以字母和数字组成的code kind:1
    public String codeMakerWordAndNumber(int length){
        StringBuilder sb = new StringBuilder("");
        Random random = new Random();
        for(int i = 0;i < 30; i++){
            int tag = random.nextInt(36);
            sb.append(space[tag]);
        }
        return sb.toString();
    }

    //生成指定数目、指定规则的code 去重
    public List<String> listOfCode(int kind,int number){
        String str;
        boolean tag;
        Set<String> set = new HashSet<String>();
        if(kind ==1){
            for(int i = 0;i<number;i++){
                str = codeMakerWordAndNumber(30);
                tag = set.add(str);//重复的话返回false？
                while(!tag){
                    str = codeMakerWordAndNumber(30);
                    tag = set.add(str);//确保添加到set中的都是非重复的
                }
            }
        }
        return new ArrayList<>(set);//返回set转化的list
    }
}
