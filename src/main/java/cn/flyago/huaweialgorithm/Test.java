package cn.flyago.huaweialgorithm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() + ",");
        }
        System.out.println("line");
    }
}