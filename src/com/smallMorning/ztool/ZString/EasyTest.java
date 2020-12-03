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

        //idea可以自动转义
        //String transport = "{\"Creator\":\"\",\"NeedUpDateFields\":[],\"NeedReturnFields\":[],\"IsDeleteEntry\":\"true\",\"SubSystemId\":\"\",\"IsVerifyBaseDataField\":\"false\",\"IsEntryBatchFill\":\"true\",\"ValidateFlag\":\"true\",\"NumberSearch\":\"true\",\"InterationFlags\":\"\",\"Model\":{\"FID\":0,\"FName\":\"\",\"FStaffNumber\":\"\",\"FMobile\":\"\",\"FTel\":\"\",\"FEmail\":\"\",\"FDescription\":\"\",\"FAddress\":\"\",\"FUseOrgId\":{\"FNumber\":\"\"},\"FCreateOrgId\":{\"FNumber\":\"\"},\"FBranchID\":{\"FNUMBER\":\"\"},\"FCreateSaler\":\"false\",\"FCreateUser\":\"false\",\"FCreateCashier\":\"false\",\"FCashierGrp\":{\"FNUMBER\":\"\"},\"FSalerId\":{\"FNUMBER\":\"\"},\"FCashierId\":{\"FNUMBER\":\"\"},\"FUserId\":{\"FUSERACCOUNT\":\"\"},\"FPostId\":{\"FNUMBER\":\"\"},\"FJoinDate\":\"1900-01-01\",\"FUniportalNo\":\"\",\"FSHRMapEntity\":{\"FMAPID\":0},\"FPostEntity\":[{\"FENTRYID\":0,\"FWorkOrgId\":{\"FNumber\":\"\"},\"FPostDept\":{\"FNumber\":\"\"},\"FPost\":{\"FNumber\":\"\"},\"FStaffStartDate\":\"1900-01-01\",\"FIsFirstPost\":\"false\"}],\"FBankInfo\":[{\"FBankId\":0,\"FBankCountry\":{\"FNumber\":\"\"},\"FBankCode\":\"\",\"FBankTypeRec\":{\"FNUMBER\":\"\"},\"FBankHolder\":\"\",\"FTextBankDetail\":\"\",\"FBankDetail\":{\"FNUMBER\":\"\"},\"FOpenBankName\":\"\",\"FOpenAddressRec\":\"\",\"FCNAPS\":\"\",\"FBankCurrencyId\":{\"FNUMBER\":\"\"},\"FBankIsDefault\":\"false\",\"FBankDesc\":\"\"}]}}";

    }

}
