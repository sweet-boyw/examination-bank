/*
* 统计字符个数
* 计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
* */


import java.util.HashMap;
import java.util.Scanner;

public class countNumberChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> hs = new HashMap<>();
        System.out.println("请输入字符串：");
        String[] strArr = scanner.nextLine().toLowerCase().split("");
        for (int i = 0; i < strArr.length; i++){
            hs.put(strArr[i],strArr[i]);
        }
        System.out.println(hs.size());
    }
}
