/*
*  求近似数
* 接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整
* */
import java.util.Scanner;

public class approximateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数：");
        float num = scanner.nextFloat();
        double rem = num % 1.0;
        int rex = (int)num / 1;
//        System.out.println(rem);
        if (rem >= 0.5){
            rex += 1;
            System.out.println(rex);
        }else {
            System.out.println(rex);
        }
    }
}
