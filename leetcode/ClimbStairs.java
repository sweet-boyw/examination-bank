/*
* 爬楼梯
* 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
* 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
* */
public class ClimbStairs {
    public static void main(String[] args) {
        int result = climb(3);
        System.out.println(result);
    }
    public static int climb(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climb(n - 1) + climb(n - 2);
    }
}
