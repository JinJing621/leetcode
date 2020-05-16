package com.daixia.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    private static Map<String, Integer> romanMap = new HashMap<String, Integer>();
    static{
        romanMap.put("I",1);
        romanMap.put("IV",4);
        romanMap.put("V",5);
        romanMap.put("IX",9);
        romanMap.put("X",10);
        romanMap.put("XL",40);
        romanMap.put("L",50);
        romanMap.put("XC",90);
        romanMap.put("C",100);
        romanMap.put("CD",400);
        romanMap.put("D",500);
        romanMap.put("CM",900);
        romanMap.put("M",1000);
    }
    public static int romanToInt(String s) {
        int i = 0;
        int res = 0;
        while(i < s.length()){
            if(i < s.length() - 1 && null != romanMap.get(s.substring(i, i+2))){
                res = res + romanMap.get(s.substring(i, i+2));
                i = i + 2;
            }else{
                res = res + romanMap.get(s.substring(i, i+1));
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
