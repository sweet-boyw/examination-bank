/**
 * 字符串分隔
 * •输入一个字符串，请按长度为8拆分每个输入字符串并进行输出
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 思路：将一个数除1取余可以拿到小数部分，除10取余可以拿到最后一位数字
 */
import java.util.Scanner;
import java.util.Arrays;

public class strDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 构建字符缓冲区
        String str = scanner.nextLine();
        sb.append(str);
        int strlen = str.length();
        int addZeroLen = 8 - strlen % 8;
        for (int i = 0; i < addZeroLen; i ++){
            sb.append("0");
        }
        String str1 = sb.toString();
        int len = str1.length() / 8;
        String[] strarr = new String[len];
        for (int i = 0; i < len; i++){
            strarr[i] = str1.substring(i * 8, (i + 1) * 8);
        }
        for (int i = 0; i < strarr.length; i++){
            System.out.println(strarr[i] + " ");
        }
    }
}