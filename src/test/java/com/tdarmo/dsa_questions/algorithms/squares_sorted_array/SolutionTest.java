package com.tdarmo.dsa_questions.algorithms.squares_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
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
    void testSortedSquares_givenFirstExamples_returnSortedSquaresArray() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};

        Assertions.assertArrayEquals(expected, Solution.sortedSquares(nums));
    }

    @Test
    void testSortedSquares_givenSecondExamples_returnSortedSquaresArray() {
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};

        Assertions.assertArrayEquals(expected, Solution.sortedSquares(nums));
    }
}
