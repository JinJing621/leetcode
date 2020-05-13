package com.daixia.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q12 {
    private static Map<Integer, String> romanMap = new HashMap<Integer, String>();
    static{
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
    }
    public String intToRoman(int num) {
        int dividend = 1000;
        StringBuilder res = new StringBuilder();
        while(dividend > 0){
            res.append(subRoman(num/dividend, dividend));
            num = num % dividend;
            dividend = dividend / 10;
        }
        return res.toString();
    }

    private String subRoman(int temp, int key){
        if(temp == 0){
            return "";
        }
        StringBuilder res = new StringBuilder("");
        if(temp >=1 && temp < 4){
            while(temp > 0){
                res.append(romanMap.get(key));
                temp--;
            }
        } else if(temp >= 5 && temp < 9){
            res.append(romanMap.get(5*key));
            while(temp - 5 > 0){
                res.append(romanMap.get(key));
                temp--;
            }
        }else{
            res.append(romanMap.get(temp*key));
        }
        return res.toString();
    }
}
