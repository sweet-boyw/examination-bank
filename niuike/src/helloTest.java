/*
* @testhello
* */

import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Integer;



public class helloTest {
//    public static void main(String[] args) {
//        System.out.println("hello test");
//    }
//    hasmap test
    public static void main(String[] args) {
        String arr[] =  new String[]{"ji","yu","ta","vd","ji"};
        HashMap<String,String> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i ++){
            hs.put(arr[i] + i,arr[i]);
        }
        System.out.println(hs);
    }
}
