/**
 * 接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次
 */
import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {
        int times = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine().toLowerCase();
        System.out.println("请输入字符：");
        char cha = scanner.next().toLowerCase().charAt(0);
        String[] arr = str.split("");
        for (int i = 0;i < arr.length; i++){
            if(arr[i].charAt(0) == cha){
                times += 1;
            }
        }
        System.out.print(cha + "字符出现了" + times + "次");
    }
}
