package leetcode.algorithms;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (35.14%)
 * Total Accepted:    348.7K
 * Total Submissions: 987.1K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 *
 * Note:
 *
 *
 * The number of elements initialized in nums1 and nums2 are m and n
 * respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to
 * m + n) to hold additional elements from nums2.
 *
 *
 * Example:
 *
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 *
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Desc:
 *
 * @author zhanglinwei02
 * @date 2019-04-16
 */
public class _0088MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 将nums2数组移到nums1数组上
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    @Test
    public void test() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }
}
