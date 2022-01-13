package com.tdarmo.dsa_questions.data_structures.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SolutionTest {
    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numsMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int leftToTarget = target - nums[i];
                if (numsMap.get(leftToTarget) != null) {
                    return new int[]{numsMap.get(leftToTarget), i};
                }
                numsMap.put(nums[i], i);
            }

            return new int[]{0, 0};
        }
    }

    @Test
    void testTwoSum_givenFirstExample_returnZeroAndOne() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, Solution.twoSum(nums, 9));
    }

    @Test
    void testTwoSum_givenSecondExample_returnOneAndTwo() {
        int[] nums = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, Solution.twoSum(nums, 6));
    }

    @Test
    void testTwoSum_givenThirdExample_returnZeroAndOne() {
        int[] nums = new int[]{3, 3};
        int[] expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, Solution.twoSum(nums, 6));
    }
}
