package com.smallMorning.ztool.ZString;

public class EasyTest {

    public static void mian(String[] args){
        String str1 = "as\"dfg";
        String str2 = null;
        String[] tihuan = {"\""};
        String daiti = "\\\"";
        str2 = ZString.zReplace(str1,tihuan,daiti);
        System.out.println(str1);
        System.out.println(str2);
    }

}
