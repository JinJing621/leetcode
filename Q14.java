package com.daixia.leetcode;

public class Q14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0){
            return "";
        }
        int i;
        label:for(i=0; i<strs[0].length(); i++){
            char temp = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != temp){
                    break label;
                }
            }
        }
        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        longestCommonPrefix(strs);
    }
}
