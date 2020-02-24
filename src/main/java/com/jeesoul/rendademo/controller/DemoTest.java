package com.jeesoul.rendademo.controller;

/**
 * @author：dxy
 * @date : 2020-02-22
 */
public class DemoTest {
    public static void main(String[] args) {

        String id = "341181199504041011";
        System.out.println(extractYearMonthDayOfIdCard(id));

    }


    public static String extractYearMonthDayOfIdCard(String id) {
        String year = null;
        String month = null;
        String day = null;
        //正则匹配身份证号是否是正确的，15位或者17位数字+数字/x/X
        if (id.matches("^\\d{15}|\\d{17}[\\dxX]$")) {
            year = id.substring(6, 10);
            month = id.substring(10,12);
            day = id.substring(12,14);
        }else {
            System.out.println("身份证号码不匹配！");
            return null;
        }
        return year + "-" + month + "-" + day;
    }


}
