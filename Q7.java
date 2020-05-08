package com.daixia.leetcode;

public class Q7 {
    public int reverse(int x) {
        int sign = 1;
        if(x < 0){
            sign = -1;
        }
        int res = 0;
        while (Math.abs(x) > 0){
            res = res*10 + x%10;
            x = x/10;
        }
        return res;
    }
}
