package com.daixia.leetcode;

public class Q5 {
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length == 0){
            return "";
        }
        Integer left = 0;
        Integer right = 0;
        Integer maxRes = 1;
        for(int i=0; i<length; i++){
            for(int j=i; j <= i+1; j++){
                if( j >= length){
                    break;
                }
                int temp = maxPalindorm(i,j,s);
                if(2 * temp + j-i+1 > maxRes){
                    maxRes = 2 * temp + j-i+1;
                    left = i - temp;
                    right = j + temp;
                }
            }
        }
        return s.substring(left, right + 1);
    }

    private int maxPalindorm(Integer c1, Integer c2, String s){
        int step = 0;
        while(c1-step >= 0 && c2+step < s.length()){
            if(s.charAt(c1-step) == s.charAt(c2+step)){
                step = step + 1;
            }else{
                break;
            }
        }
        return step-1;
    }
}
