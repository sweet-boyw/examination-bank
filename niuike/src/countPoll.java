/*
* 计票统计
* 输入
* 第一行输入候选人的人数n，第二行输入n个候选人的名字（均为大写字母的字符串），第三行输入投票人的人数，第四行输入投票
* 输出
* 按照输入的顺序，每行输出候选人的名字和得票数量（以" : "隔开，注：英文冒号左右两边都有一个空格！），最后一行输出不合法的票数，格式为"Invalid : "+不合法的票数
* */
import java.util.Scanner;

public class countPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入候选人的人数：");
        int persons = scanner.nextInt();
        System.out.println("输入n个候选人的名字（均为大写字母的字符串,用空格隔开）:");
        String[] names = scanner.nextLine().split(" ");
        System.out.println("输入投票人的人数:");
        int pollPersons = scanner.nextInt();
        System.out.println("输入投票(输入对应的名字，空格隔开)：");
        String[] pollArrs = scanner.nextLine().split(" ");
    }
}
