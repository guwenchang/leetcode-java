package com.example.leetcode.sort;

/**
 * 堆排序
 * 基于堆的存储，每次取出最大值，然后重新构建堆
 *
 * @author guwenchang
 * @date 2019-07-11 14:29
 */
public class HeapSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        int lastIndex = nums.length-1;
        buildMaxHeap(nums, lastIndex);
        while(lastIndex > 0){
            swap(nums, 0, lastIndex);
            if(--lastIndex == 0){
                //只剩一个元素，就不用调整堆了，排序结束
                break;
            }
            adjustHeap(nums,0,lastIndex);
        }
        return nums;
    }
    public void buildMaxHeap(int[] arr, int lastIndex) {
        // 从最后一个元素的父节点开始进行调整，一直调整到根节点结束
        int j = (lastIndex - 1) / 2;
        while (j >= 0) {
            adjustHeap(arr, j--, lastIndex);
        }
    }

    public void adjustHeap(int[] arr, int rootIndex, int lastIndex) {
        //从根节点开始往下调整
        int biggerIndex = rootIndex;
        int leftChildIndex = rootIndex * 2 + 1;
        int rightChildIndex = rootIndex * 2 + 2;
        if(rightChildIndex <= lastIndex){
            //如果右孩子存在，则左孩子一定存在
            if(arr[rightChildIndex] > arr[rootIndex] || arr[leftChildIndex] > arr[rootIndex]){
                //将子节点更大的元素下标赋值给biggerIndex
                biggerIndex = arr[rightChildIndex] > arr[leftChildIndex]?rightChildIndex:leftChildIndex;
            }
        }
        else if(leftChildIndex <= lastIndex){
            //保证左孩子存在，且不能越界
            if(arr[leftChildIndex] > arr[rootIndex]){
                biggerIndex = leftChildIndex;
            }
        }
        if(biggerIndex != rootIndex){
            swap(arr, biggerIndex, rootIndex);
            adjustHeap(arr, biggerIndex, lastIndex);
        }
    }
    public void swap(int[] arr, int biggerIndex, int rootIndex) {
        int temp = arr[rootIndex];
        arr[rootIndex] = arr[biggerIndex];
        arr[biggerIndex] = temp;
    }
}