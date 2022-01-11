package com.tdarmo.dsa_questions.data_structures.contains_duplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SolutionTest {
    public static class Solution {
        public static boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Boolean> numberMap = new HashMap<>();
            for (int number : nums) {
                if (numberMap.get(number) != null) return true;
                numberMap.put(number, true);
            }

            return false;
        }
    }

    @Test
    void testContainsDuplicate_givenDuplicateMember_returnTrue() {
        int[] input = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(Solution.containsDuplicate(input));
    }

    @Test
    void testContainsDuplicate_givenNoDuplicateMember_returnTrue() {
        int[] input = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(Solution.containsDuplicate(input));
    }

    @Test
    void testContainsDuplicate_givenMultipleDuplicateMember_returnTrue() {
        int[] input = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(Solution.containsDuplicate(input));
    }
}


