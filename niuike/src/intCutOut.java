/*
*
* 输入n个整数，找出其中最小的k个整数并按升序输出
 */
import java.util.Arrays;
import java.util.Scanner;
public class intCutOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
           while (scanner.hasNextLine()){
               int len = scanner.nextInt();
               int lenCut = scanner.nextInt();
               int[] arr = new int[len];
               for (int i = 0; i < len; i++){
                   arr[i] = scanner.nextInt();
               }
               Arrays.sort(arr);
               for (int i = 0; i < lenCut; i ++){
                   System.out.println(arr[i] + " ");
               }
               break;
           }
       }finally {
           scanner.close();
       }
    }
}
