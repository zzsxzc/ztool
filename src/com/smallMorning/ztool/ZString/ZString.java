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

        String strToChange = sbf.toString().trim();
        System.out.println(strToChange);

        String str2 = null;
        System.out.println(sbf);
        String[] toChange = {"\""};
        str2 = ZString.zReplace(sbf.toString(),toChange,"\\\"");
        System.out.println(str2);

        String str3 = "\\\"\\\"NeedUpDateFields\\\":[],\\\"NeedReturnFields\\\":[],\\\"IsDeleteEntry\\\":\\\"true\\\", \\\"SubSystemId\\\":\\\"\\\",\" +\n" + "\"\\\"IsVerifyBaseDataField\\\":\\\"false\\\", \\\"IsEntryBatchFill\\\":\\\"true\\\", \\\"ValidateFlag\\\":\\\"true\\\", \\\"NumberSearch\\\":\\\"true\\\", \\\"InterationFlags\\\":\\\"\\\",\" +\n" + "\" \\\"Model\\\":{ \\\"FID\\\":0,\\\"FName\\\":\\\"\\\", \\\"FStaffNumber\\\":\\\"\\\", \\\"FMobile\\\":\\\"\\\", \\\"FTel\\\":\\\"\\\", \\\"FEmail\\\":\\\"\\\", \\\"FDescription\\\":\\\"\\\", \\\"FAddress\\\":\\\"\\\", \" +\n" + "\"\\\"FUseOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FCreateOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FBranchID\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FCreateSaler\\\":\\\"false\\\", \" +\n" + "\"\\\"FCreateUser\\\":\\\"false\\\", \\\"FCreateCashier\\\":\\\"false\\\", \\\"FCashierGrp\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FSalerId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\" +\n" + "\"\\\"FCashierId\\\":{ \\\"FNUMBER\\\":\\\"\\\"\\\"},\\\"FUserId\\\":{ \\\"FUSERACCOUNT\\\":\\\"\\\"},\\\"FPostId\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\\\"FJoinDate\\\":\\\"1900 - 01 - 01\\\", \" +\n" + "\"\\\"FUniportalNo\\\":\\\"\\\", \\\"FSHRMapEntity\\\":{ \\\"FMAPID\\\":0},\\\"FPostEntity\\\":[{\\\"FENTRYID\\\":0,\\\"FWorkOrgId\\\":{ \\\"FNumber\\\":\\\"\\\"},\" +\n" + "\"\\\"FPostDept\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FPost\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"\\\"FStaffStartDate\\\":\\\"1900 - 01 - 01\\\", \\\"FIsFirstPost\\\":\\\"false\\\"}],\" +\n" + "\"\\\"FBankInfo\\\":[{\\\"FBankId\\\":0,\\\"FBankCountry\\\":{ \\\"FNumber\\\":\\\"\\\"},\\\"FBankCode\\\":\\\"\\\", \\\"FBankTypeRec\\\":{ \\\"FNUMBER\\\":\\\"\\\"},\" + \n" + "\"\\\"FBankHolder\\\":\\\"\\\", \\\"FTextBankDetail\\\":\\\"\\\", \\\"FBankDetail\\\":{ \\\"FNUMBER\\\":\\\"\\\"\\\"},\\\"FOpenBankName\\\":\\\"\\\"\\\", \"+\n" + "\"\\\"FOpenAddressRec\\\":\\\"\\\", \\\"FCNAPS\\\":\\\"\\\", \\\"FBankCurrencyId\\\":{ \\\"FNUMBER\\\":\\\"\\\"\\\"},\\\"FBankIsDefault\\\":\\\"false\\\", \\\"FBankDesc\\\":\\\"\\\"}]}}\\\"";
        String str4 = str3.trim();
        System.out.println(strToChange.length());
        System.out.println(str4.length());
        System.out.println(str2.equals(str4));
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
