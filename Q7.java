package com.daixia.leetcode;

public class Q7 {
    public static int reverse(int x) {
        int res = 0;
        while (Math.abs(x) > 0){
            System.out.println(res);
            res = res*10 + x%10;
            x = x/10;
            if(Math.abs(x) > 0 && (res > 214748364 || (res == 214748364 && x > 7))){
                return 0;
            }
            if(Math.abs(x) > 0 && (res < -214748364 || (res == -214748364 && x < -8))){
                return 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a = -2147483412;
        //System.out.println(-214384741 > -214748364);
        System.out.println(reverse(a));
    }
}
