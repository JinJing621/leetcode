package com.daixia.leetcode;

public class Q9 {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if(x < 0){
            return false;
        }
        int old = x;
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if(rev == old){
            return true;
        }else{
            return false;
        }
    }
}
