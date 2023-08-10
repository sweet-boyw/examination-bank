/*
* 坐标移动
* 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出
* A10;S20;W10;D30;X;A1A;B10A11;;A10;
* 处理过程：
* 起点（0,0）
* A10   =  （-10,0）
* S20   =  (-10,-20)
* W10  =  (-10,-10)
* D30  =  (20,-10)
* x    =  无效
* A1A   =  无效
* B10A11   =  无效
* 一个空 不影响
* A10  =  (10,-10)
* 结果 （10， -10）
* */
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.ArrayList;
public class coordinateRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 定义x, y两个初始地点
        int x = 0;
        int y = 0;
        // 提示用户操作
        System.out.println("请输入操作（用英文;分开）：");
        // 获取用户输入操作
        String[] coordinate = scanner.nextLine().split(";");
        int len = coordinate.length;
        // 定义x y 两个方向的操作
        ArrayList<Integer> xlist = new ArrayList<>();
        ArrayList<Integer> ylist = new ArrayList<>();
        for (int i = 0; i < len; i++){
            // System.out.println(coordinate[i] + "====" + coordinate[i].length());
            try{
                int cleng = coordinate[i].length();
                int num = Integer.parseInt(coordinate[i].substring(1,cleng));
                String ch = coordinate[i].substring(0,1);
                switch (ch){
                    case "A":
                        xlist.add(-num);
                        break;
                    case "D":
                        xlist.add(num);
                        break;
                    case "S":
                        ylist.add(-num);
                        break;
                    case "W":
                        ylist.add(num);
                        break;
                    default:
                        System.out.println("输入的操作符"+coordinate[i]+"不合法");
                }
            }catch (Exception e){
                System.out.println(e + "操作有误");
            }
        }

        for (int o : xlist) {
            x += o;
        }
        for (int i: ylist){
            y += i;
        }

        System.out.println("(x,y):" + "(" + x + "," + y + ")");
    }
}