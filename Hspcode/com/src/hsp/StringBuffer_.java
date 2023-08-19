package com.src.hsp;

public class StringBuffer_ {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello"); // 容量16
        String str1 = "hello";
        System.out.println(stringBuffer);
        System.out.println(str1);
        StringBuffer stringBuffer1 = new StringBuffer(100);// 容量100
        // String --> StringBuffer
        // 构造器
        String str2 = "hello tom";
        StringBuffer stringBuffer3 = new StringBuffer(str2);
        // append
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(str2);
        System.out.println(stringBuffer3);
        System.out.println(stringBuffer4);
        // StringBuffer --> String
        String str4 = stringBuffer4.toString();
        System.out.println(str4);
        String str5 = new String(stringBuffer3);
        System.out.println(str5);
        System.out.println("=========StringBuffer常用方法===================");
        StringBuffer s = new StringBuffer("hello");
        // append
        s.append(","); // hello,
        s.append("wangxingjiang");//hello,wangxingjiang
        s.append("kafaka");// hello,wangxingjiangkafaka
        s.delete(2,4); //heo,wangxingjiangkafaka
        s.replace(2,4,"wawa");//hewawawangxingjiangkafaka
        int indexof = s.indexOf("wawa");//2
        s.insert(9,"王兴江");//hewawawan王兴江gxingjiangkafaka
        System.out.println(indexof);
        System.out.println(s);
    }
}