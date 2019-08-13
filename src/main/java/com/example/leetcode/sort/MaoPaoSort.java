package com.example.leetcode.sort;

import javax.xml.stream.FactoryConfigurationError;

/**
 * 冒泡排序
 * 每次遍历寻找最大元素并至于数组最后
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class MaoPaoSort implements Sort {

    @Override
    public void sort(int[] nums){
        if (nums.length == 0){
            return;
        }
        boolean swap;
        for (int i = 0; i< nums.length;i++){
            swap = false;
            for (int j = 0; j < nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    swap = true;
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if (!swap){
                return;
            }
        }


    }


}
