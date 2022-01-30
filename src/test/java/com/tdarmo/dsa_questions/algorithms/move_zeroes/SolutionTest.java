package com.tdarmo.dsa_questions.algorithms.move_zeroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static abstract class Solution {
        public static int[] moveZeroes(int[] nums) {
            if (nums.length < 2) return nums;

            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == 0) {
                    for (int j = i; j < nums.length - 1; j++) {
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            return nums;
        }
    }

    @Test
    void testMoveZeroes_givenFirstExample_returnMovedArray() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};

        int[] result = Solution.moveZeroes(nums);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testMoveZeroes_givenSecondExample_returnMovedArray() {
        int[] nums = new int[]{0};
        int[] expected = new int[]{0};

        int[] result = Solution.moveZeroes(nums);

        Assertions.assertArrayEquals(expected, result);
    }
}
