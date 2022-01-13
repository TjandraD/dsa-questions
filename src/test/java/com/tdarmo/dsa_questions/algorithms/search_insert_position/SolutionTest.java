package com.tdarmo.dsa_questions.algorithms.search_insert_position;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int searchInsert(int[] nums, int target) {
            int startIndex = 0;
            int endIndex = nums.length - 1;

            while (startIndex < endIndex) {
                int mid = startIndex + (endIndex - startIndex) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    endIndex = mid - 1;
                } else if (nums[mid] < target) {
                    startIndex = mid + 1;
                }
            }

            return endIndex + 1;
        }
    }

    @Test
    void testSearchInsert_givenFirstExample_returnTwo() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(2, Solution.searchInsert(nums, 5));
    }

    @Test
    void testSearchInsert_givenSecondExample_returnOne() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(1, Solution.searchInsert(nums, 2));
    }

    @Test
    void testSearchInsert_givenThirdExample_returnFour() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assertions.assertEquals(4, Solution.searchInsert(nums, 7));
    }
}
