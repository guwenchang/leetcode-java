package com.example.leetcode.sort;

/**
 * 选择排序
 * 每次找出最小的元素
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class SelectSort implements Sort {

    @Override
    public int[] sort(int[] nums){
        if (nums.length == 0){
            return nums;
        }
        for (int i = 0; i< nums.length;i++){
            int minIndex = i;
            for (int j = i + 1; j < nums.length;j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
        }
        return nums;
    }


}
