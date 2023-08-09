/*
* 提取不重复数值
* 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
* */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class withoutRepitionNumber {
    public static void main(String[] args) {
//        创建一个hashmap来存储不重复的数值
        LinkedHashMap<String,Integer> hs = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数值：");
        int num = scanner.nextInt();
        while(num != 0){
            int temp = num % 10;
            num /= 10;
            hs.put(temp + "",temp);
            System.out.println("num % 10 = " + temp);
        }
        System.out.println(hs.values());
    }
}
/*
* 知识点：
* HashMap 无序
* linkedHashMap 保持输入顺序输出
* */
