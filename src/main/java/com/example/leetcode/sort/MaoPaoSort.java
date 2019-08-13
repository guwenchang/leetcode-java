package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class MaoPaoSort {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5,1,6};
        sort2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        for (int i = 0; i< nums.length;i++){
            for (int j = 0; j< nums.length-1-i;j++){
                if (nums[j+1] < nums[j]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    public static void sort2(int[] nums){
        for (int i = 0; i< nums.length;i++){
            int minIndex = i;
            for (int j = i; j< nums.length;j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }


}
