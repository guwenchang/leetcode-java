package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 分治最后在合并，基于递归
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] nums){
        if (nums.length < 2){
            return nums;
        }
        return mergeSort(nums);
    }

    public int[] mergeSort(int[] nums){
        if (nums.length < 2){
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length){
                result[index] = right[j++];
            } else if (j >= right.length){
                result[index] = left[i++];
            } else if (left[i] > right[j]){
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

}
