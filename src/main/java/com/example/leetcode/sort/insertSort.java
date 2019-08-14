package com.example.leetcode.sort;

/**
 * 插入排序
 * 假设前面数组是有序的，然后后面的元素向前面的有序数组插入
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class insertSort implements Sort {

    @Override
    public int[] sort(int[] nums){
        if (nums.length == 0){
            return nums;
        }
        int current;
        for (int i = 0; i< nums.length - 1;i++){
            current = nums[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1] = current;
        }
        return nums;
    }


}
