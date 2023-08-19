/*
* 句子逆序
* 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
* */
import java.util.Scanner;
import java.util.ArrayList;

public class contentReserve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入句子，用空格隔开单词:");
        String[] content = scanner.nextLine().split(" ");
        int len = content.length;
        ArrayList list = new ArrayList();
        for (int i = 0;i < len; i++){
            list.add(content[len - 1 - i]);
        }
        System.out.println(list);
    }
}
