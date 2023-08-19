/*
* 提取不重复数值
* 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
* */
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class withoutRepitionNumber {
    public static void main(String[] args) {
//        创建一个hashmap来存储不重复的数值
        LinkedHashMap<String,Integer> hs = new LinkedHashMap<>();
        withoutRepitionNumber withrn = new withoutRepitionNumber();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num != 0){
            int temp = num % 10;
            num /= 10;
            hs.put(temp + "",temp);
        }
        Integer[] resArr = hs.values().toArray(new Integer[0]);
        withrn.ArrarToInt(resArr);
    }
    public static int ArrarToInt(Integer[] arr){
        int res = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++){
            res += arr[i] * Math.pow(10, len - i - 1);
        }
        System.out.println(res);
        return res;
    }
}
/*
* 知识点：
* HashMap 无序
* linkedHashMap 保持输入顺序输出
* */