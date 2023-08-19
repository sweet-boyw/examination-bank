/*
* 有效的括号
* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
* 左括号必须用相同类型的右括号闭合。
* 左括号必须以正确的顺序闭合。
* 每个右括号都有一个对应的相同类型的左括号。
* */
import java.util.ArrayList;
import java.util.Arrays;

public class isValid {
    public static void main(String[] args) {
        System.out.println("=============");
        boolean re = isValidBrackets(new String[]{"(",")","[","]"});
        System.out.println(re);
    }
    public static Boolean isValidBrackets(String[] s){
        if (s.length % 2 == 1) return false;
        ArrayList shed = new ArrayList();
        for (int i = 0; i < s.length; i++){
            if (s[i] == "(" || s[i] == "{" || s[i] == "[" || s[i] == "<"){
                shed.add(s[i]);
                System.out.println("add"+shed);
            }else {
                if (s[i] == "(" && shed.get(shed.size() - 1) == ")" || s[i] == "{" && shed.get(shed.size() - 1) == "}" || s[i] == "[" && shed.get(shed.size() - 1) == "]" || s[i] == "<" && shed.get(shed.size() - 1) == ">"){
                    shed.remove(shed.size() - 1);
                    System.out.println("remove"+shed);
                }else {
                    return false;
                }
            }
        }
        return shed.size() == 0;
    }
}
