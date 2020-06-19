package com.zz.lib;

public class BasicMath {

    public static long binPow(int a, int b, int m) {
        long p = 1L;
        long e = a;
        while (b > 0) {
            if ((b & 1) == 1) p = (p * e) % m;
            e = (e * e) % m;
            b >>= 1;
        }
        return p;
    }

//    public static void main(String[] args) {
//        System.out.println(BasicMath.binPow(2, 5, 10000));
//    }

}
