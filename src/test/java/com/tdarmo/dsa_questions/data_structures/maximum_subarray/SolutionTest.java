package com.tdarmo.dsa_questions.data_structures.maximum_subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;

            for (int num : nums) {
                sum += num;
                max = Math.max(max, sum);

                if (sum < 0) sum = 0;
            }

            return max;
        }
    }

    @Test
    void testMaxSubArray_givenFirstExample_returnSix() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, Solution.maxSubArray(nums));
    }

    @Test
    void testMaxSubArray_givenSecondExample_returnOne() {
        int[] nums = new int[]{1};
        Assertions.assertEquals(1, Solution.maxSubArray(nums));
    }

    @Test
    void testMaxSubArray_givenThirdExample_returnTwentyThree() {
        int[] nums = new int[]{5, 4, -1, 7, 8};
        Assertions.assertEquals(23, Solution.maxSubArray(nums));
    }
}
