package com.daixia.leetcode;
public class Q6 {
    public String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows == 1){
            return s;
        }
        int direction = 1;
        int count = 0;
        StringBuilder[] res = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            res[i] = new StringBuilder();
        }
        for(int i=0; i< s.length(); i++){
            res[count].append(s.charAt(i));
            if(direction > 0){
                count++;
            }else{
                count--;
            }
            if(count == 0 || count == numRows-1){
                direction = -direction;
            }
        }
        StringBuilder rr = new StringBuilder();
        for(int i=0; i<numRows; i++){
            rr.append(res[i]);
        }
        return rr.toString();
    }

    public static void main(String[] args) {
    }
}
