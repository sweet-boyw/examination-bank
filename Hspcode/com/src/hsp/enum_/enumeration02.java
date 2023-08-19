package com.src.hsp.enum_;

public class enumeration02 {
    public static void main(String[] args) {
        System.out.println("==============通过关键字enum实现枚举===================");
        System.out.println(Season2.AUTUMN);
    }
}
enum Season2{
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;
    private Season2(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    @Override
    public String toString(){
        return "SeaSon{"  + "name='" + name + '\'' + ",desc='" + desc +'\'' + '}';
    }
}