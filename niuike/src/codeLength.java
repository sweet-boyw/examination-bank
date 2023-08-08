import java.util.Scanner;
import java.util.Arrays;

public class codeLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int len = arr[arr.length - 1].split("").length;
        System.out.println(len);
    }
}
