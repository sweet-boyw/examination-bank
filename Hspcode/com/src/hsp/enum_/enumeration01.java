package com.src.hsp.enum_;

public class enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}
class Season{
    private String name;
    private String desc;
    // 定义四个对象
    public static Season SPRING = new Season("春天","温暖");
    public static Season SUMMER = new Season("夏天","炎热");
    public static Season AUTUMN = new Season("秋天","凉爽");
    public static Season WINTER = new Season("冬天","寒冷");
    public Season(String name, String desc){
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
