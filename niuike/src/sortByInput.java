/*
* 输入整型数组和排序标识，对其元素按照升序或降序进行排序
* 第一行输入数组元素个数
* 第二行输入待排序的数组，每个数用空格隔开
* 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
* */
import java.util.Arrays;
import java.util.Scanner;

public class sortByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] arr = new int[len];
        while (scanner.hasNext()){
            for (int i = 0; i < len; i++){
                arr[i] = scanner.nextInt();
            }
            break;
        }
        int sortType = scanner.nextInt();
        if (sortType == 0){
            int[] res = sortNormal(arr);
            for (int i = 0; i < res.length; i++){
                System.out.print(res[i] + " ");
            }
        } else if (sortType == 1) {
            int[] nres = sortNormal(arr);
            int[] rres = sortReverse(nres);
            for (int i = 0; i < rres.length; i++){
                System.out.print(rres[i] + " ");
            }
        }else {
            System.out.println("排序方式不合法");
        }
    }
    // 正向排序
    public static int[] sortNormal(int[] arr){
        int len = arr.length;
        int tmp;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - 1 - i; j ++){
                if (arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
    // 逆向排序
    public static int[] sortReverse(int[] arr){
        int len = arr.length;
        int tmp;
        for (int i = 0; i <= len / 2; i ++){
            tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
        return arr;
    }
}
