package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * @author guwenchang
 * @date 2019-08-13 19:17
 */
public class SortTest {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5,1,6};
        Sort sort = new HeapSort();
        nums = sort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
