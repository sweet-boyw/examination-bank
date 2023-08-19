/*
* 字符串的截取
* */

import java.util.Scanner;
public class strCutOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int key = scanner.nextInt();
        String resStr = "";
        for (int i = 0; i < key; i++){
            resStr  += str.charAt(i) + "";
        }
        System.out.println(resStr);
    }
}
