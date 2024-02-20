package com.hef.puzzles;

/**
 * @Date 2024/1/16
 * @Author lifei
 */
public class JavaPuzzles03 {

    public static void main(String[] args) {
        int a = -100;
        long b = (a+1) & Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(b);
        System.out.println((~a & Integer.MAX_VALUE));
        System.out.println(abs(a));
        System.out.println(Math.sqrt(4d));
        System.out.println(StrictMath.sqrt(4d));
    }

    public static int abs(int a) {
        if (a>=0) {
            return a;
        }
        if (a==Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (~a & Integer.MAX_VALUE) + 1;
    }
}
