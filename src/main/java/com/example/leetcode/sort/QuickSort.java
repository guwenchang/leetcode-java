package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 基于基准点的快速排序，分治和 递归
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] nums){
        if (nums.length < 2){
            return nums;
        }
        return quickSort(nums,0,nums.length-1);
    }

    public int[] quickSort(int[] nums,int left,int right){
            if (nums == null || left >= right || nums.length <= 1){
                return nums;
            }
            int mid = partition(nums, left, right);
            quickSort(nums, left, mid);
            quickSort(nums, mid + 1, right);
            return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int tmp = nums[left];
        while (left < right){
            while (left < right && tmp < nums[right]){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && tmp >= nums[left]){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = tmp;
        return left;
    }


}
