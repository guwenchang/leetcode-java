package com.example.leetcode.sort;

/**
 * 希尔排序
 * 插入排序的一种变种，基于跳跃分治的思想
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class ShellSort implements Sort {

    @Override
    public int[] sort(int[] nums){
        if (nums.length == 0){
            return nums;
        }
        int len = nums.length;
        int tmp,gap = len /2;
        while (gap > 0){
            for (int i = gap;i < len; i++){
                tmp = nums[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && nums[preIndex] > tmp){
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex = preIndex - gap;
                }
                nums[preIndex + gap] = tmp;
            }
            gap = gap /2;
        }
        return nums;
    }


}
