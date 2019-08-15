package com.example.leetcode.test;

/**
 * 台阶积水问题
 * @author guwenchang
 * @date 2019-08-15 14:24
 */
public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,0,2,1,0,1,3,2,1,2,1};
        int total = 0;
        int left = 0;
        int right = nums.length-1;
        int leftValue = nums[left];
        int rightValue = nums[right];
        while (left < right){
            if (leftValue < rightValue){
                left++;
                if (nums[left] >= leftValue){
                    leftValue = nums[left];
                }else {
                    total = total + leftValue - nums[left];
                }
            }else {
                right--;
                if (nums[right] >= rightValue){
                    rightValue = nums[right];
                }else {
                    total = total + rightValue - nums[right];
                }
            }

        }
        System.out.println(total);

    }


}
