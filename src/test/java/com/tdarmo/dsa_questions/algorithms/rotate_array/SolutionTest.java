package com.tdarmo.dsa_questions.algorithms.rotate_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int[] rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);

            return nums;
        }

        public static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

    @Test
    void testRotate_givenFirstExample_returnRotatedNums() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};

        int[] result = Solution.rotate(nums, 3);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testRotate_givenSecondExample_returnRotatedNums() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int[] expected = new int[]{3, 99, -1, -100};

        int[] result = Solution.rotate(nums, 2);

        Assertions.assertArrayEquals(expected, result);
    }
}
