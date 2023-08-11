/*
* 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
* 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
* 一 、 遍历矩阵
* 二 、 对角线数据相加
* */
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class addDiagonalNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int oldArr[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        list = forDiagonal(oldArr);
        System.out.println("list"+list);
        // 数据相加
        AtomicInteger sum = new AtomicInteger();
        list.forEach(i -> {
            sum.addAndGet(i);
        });
        System.out.println(sum);
    }
    // 遍历对角线
    public static ArrayList<Integer> forDiagonal(int[][] arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (i == j || i + j == arr.length - 1){
                    newArr.add(arr[i][j]);
                }
            }
        }
        System.out.println("newArr" + newArr);
        return newArr;
    }
}
