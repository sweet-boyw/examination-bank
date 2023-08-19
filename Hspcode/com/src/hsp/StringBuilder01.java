package com.src.hsp;
import java.util.Scanner;
public class StringBuilder01 {
    public static void main(String[] args) {
        System.out.println("===========StringBuilder=====================");
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        stringBuilder = new StringBuilder(scanner.next());
        stringBuilder.append(scanner.next());
    }
}
