package com.smallMorning.ztool.ZString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class ZString {
    public static void main(String[] args){

        String fileName = "C:\\Users\\LEGION\\Desktop\\json.txt";
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        String str2 = sbf.toString().trim();

        String[] toChange = {"\""};
        String strResult = null;
        strResult = ZString.zReplace(str2,toChange,"\\\\\"");
        String str3 = "{\\\"Creator\\\":\\\"\\\",\\\"NeedUpDateFields\\\":[],\\\"NeedReturnFields\\\":[],\\\"IsDeleteEntry\\\":\\\"true\\\", \\\"SubSystemId\\\":\\\"\\\",\\\"IsVerifyBaseDataField\\\":\\\"false\\\", \\\"IsEntryBatchFill\\\":\\\"true\\\", \\\"ValidateFlag\\\":\\\"true\\\", \\\"NumberSearch\\\":\\\"true\\\", \\\"InterationFlags\\\":\\\"\\\",\\\"Model\\\":{ \\\"FID\\\":0,\\\"FName\\\":\\\"\\\", \\\"FStaffNumber\\\":\\\"\\\", \\\"FMobile\\\":\\\"\\\", \\\"FTel\\\":\\\"\\\", \\\"FEmail\\\":\\\"\\\", \\\"FDescription\\\":\\\"\\\", \\\"FAddress\\\":\\\"\\\",\\\"FUseOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FCreateOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FBranchID\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FCreateSaler\\\":\\\"false\\\",\\\"FCreateUser\\\":\\\"false\\\", \\\"FCreateCashier\\\":\\\"false\\\", \\\"FCashierGrp\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FSalerId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FCashierId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FUserId\\\":{ \\\"FUSERACCOUNT\\\":\\\"\\\"},\\\"FPostId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FJoinDate\\\":\\\"1900 - 01 - 01\\\", \\\"FUniportalNo\\\":\\\"\\\", \\\"FSHRMapEntity\\\":{ \\\"FMAPID\\\":0},\\\"FPostEntity\\\":[{\\\"FENTRYID\\\":0,\\\"FWorkOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FPostDept\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FPost\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FStaffStartDate\\\":\\\"1900 - 01 - 01\\\", \\\"FIsFirstPost\\\":\\\"false\\\"}],\\\"FBankInfo\\\":[{\\\"FBankId\\\":0,\\\"FBankCountry\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FBankCode\\\":\\\"\\\", \\\"FBankTypeRec\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FBankHolder\\\":\\\"\\\", \\\"FTextBankDetail\\\":\\\"\\\", \\\"FBankDetail\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FOpenBankName\\\":\\\"\\\",\\\"FOpenAddressRec\\\":\\\"\\\", \\\"FCNAPS\\\":\\\"\\\", \\\"FBankCurrencyId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FBankIsDefault\\\":\\\"false\\\", \\\"FBankDesc\\\":\\\"\\\"}]}}";
        System.out.println("str3 length: "+str3.length());
        String str4 = str3.replaceAll(" ","");
        System.out.println("strResult length: "+strResult.length());
        System.out.println("str4 length: "+str4.length());
        System.out.println(strResult);
        System.out.println(str4);
        System.out.println(strResult.equals(str4));
    }

    //转义
    public static String zReplace(String target, String[] toChange, String replacer){
        String str=null;
        for(int i = 0;i<toChange.length;i++){
            str=target.replaceAll(toChange[i],replacer);
            target=str;
        }
        return str;
    }
}
