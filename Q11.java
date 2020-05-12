package com.daixia.leetcode;

public class Q11 {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int maxArea = 0;
        while(i < height.length - 1 && j > 0 && i < j){
            int temMin = Math.min(height[i], height[j]);
            int tempArea = (j-i) * temMin;
            maxArea = Math.max(maxArea, tempArea);
            if(height[i] < height[j]){
                i = i + 1;
                continue;
            }else{
                j = j - 1;
                continue;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,3,2,5,25,24,5}));
    }
}
