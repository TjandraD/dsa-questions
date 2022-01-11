package com.tdarmo.dsa_questions.algorithms.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int search(int[] nums, int target) {
            int startIndex = 0;
            int endIndex = nums.length - 1;

            while (startIndex <= endIndex) {
                int mid = startIndex + (endIndex - startIndex) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    endIndex = mid - 1;
                } else if (nums[mid] < target) {
                    startIndex = mid + 1;
                }
            }

            return -1;
        }
    }

    @Test
    void testSearch_givenFirstExample_returnFour() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(4, Solution.search(nums, 9));
    }

    @Test
    void testSearch_givenSecondExample_returnNegativeOne() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(-1, Solution.search(nums, 2));
    }
}
