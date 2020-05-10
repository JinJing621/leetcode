package com.daixia.leetcode;

public class Q5 {
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length == 0){
            return "";
        }
        int center = 0;
        int maxSubStr = 1;
        for(int i=0; i<length; i++){
            int j=1;
            for(j=1; j<=Math.min(i, length-1-i); j++){
                if(s.charAt(i-j) != s.charAt(i+j)){
                    break;
                }
            }
            if(maxSubStr < 2*(j-1)+1){
                maxSubStr = 2*(j-1)+1;
                center = i;
            }
        }
        for(int i=0; i<length-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                continue;
            }
            int j=1;
            for(j=1; j<=Math.min(i, length-2-i); j++){
                if(s.charAt(i-j) != s.charAt(i+1+j)){
                    break;
                }
            }
            if(maxSubStr < 2*j){
                maxSubStr = 2*j;
                center = i;
            }
        }
        if(maxSubStr%2 != 0){
            return s.substring(center-maxSubStr/2, center+maxSubStr/2+1);
        }else{
            return s.substring(center-maxSubStr/2+1, center+maxSubStr/2+1);
        }
    }
}
