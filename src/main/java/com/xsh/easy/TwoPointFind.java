package com.xsh.easy;

/**
 * 二分查找法
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class TwoPointFind {

    /**
     *
     * @param nums 数组
     * @param target 要查找的数字
     * @return
     */
    public static int search(int[] nums, int target){
        int pivot;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            pivot = (right + left) / 2;
            if(nums[pivot] == target){
                return pivot;
            }else if(nums[pivot] > target){
                right = pivot - 1;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            }
        }
        return -1;
    }
}
