/*
* 有效的密码
* 1.长度超过8位
* 2.包括大小写字母.数字.其它符号,以上四种至少三种
* 3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）
* */

import java.util.regex.*;
import java.util.Scanner;
public class validPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // 长度不够的时候直接输出NG
        if (str.length() < 8){
            System.out.println("NG");
        }
        int count = matching(str);
        boolean isrepeat = isRepeat(str,0,1);
        // 字符种类和子串是否重复同时满足
        if (count < 3 && isrepeat){
            System.out.println("NG");
        }else {
            System.out.println("OK");
        }
    }
    // 获取字符串中字符的种类
    private static int matching(String str){
        int count = 0; // 记录字符种类
        Pattern pt1 = Pattern.compile("\r|\n");
        if (pt1.matcher(str).find()){
            return 0;
        }
        Pattern pt2 = Pattern.compile("[a-z]");
        if (pt2.matcher(str).find()){
            count ++;
        }
        Pattern pt3 = Pattern.compile("[A-Z]");
        if (pt3.matcher(str).find()){
            count ++;
        }
        Pattern pt4 = Pattern.compile("[0-9]");
        if (pt4.matcher(str).find()){
            count ++;
        }
        Pattern pt5 = Pattern.compile("[^a-zA-Z0-9]");
        if (pt5.matcher(str).find()){
            count ++;
        }
        return count;
    }
    // 判断是否有重复的子串
    private static boolean isRepeat(String str,int l, int r){
        if (r >= str.length()){
            return false;
        }
        if (str.substring(l,r).contains(str.substring(l + 1,r + 1))){
            return true;
        }else {
            return isRepeat(str,l + 1, r + 1);
        }
    }
}
