/*
* 求近似值
* */
import java.util.Scanner;
public class similarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double yu = num % 1;
        if (yu >= 0.5){
            System.out.println((int)num + 1);
        }else {
            System.out.println((int)num);
        }
    }
}
