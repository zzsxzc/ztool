package com.smallMorning.ztool.ZString;

import com.alibaba.druid.sql.visitor.ExportParameterizedOutputVisitor;

public class EasyTest {

    public static void main(String[] args){
        String str1 = "as\"dfg";
        //String str1 = "as\"dfg";
        String str2 = null;
        String[] tihuan = {"\""};//表示"
        String daiti = "\\\\";//表示的字符串是\
        str2 = ZString.zReplace(str1,tihuan,daiti);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("\\");
        System.out.println("\"");
    }

}
