package com.tdarmo.dsa_questions.algorithms.palindrome_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class SolutionTest {
    public static abstract class Solution {
        public static boolean isPalindrome(int x) {
            String input = Integer.toString(x);
            String[] arrayInput = input.split("");

            for (int i = 0; i < arrayInput.length; i++) {
                int position = arrayInput.length - i - 1;
                if (!Objects.equals(arrayInput[i], arrayInput[position])) return false;
            }

            return true;
        }
    }

    @Test
    void testIsPalindrome_givenFirstExample_returnTrue() {
        Assertions.assertTrue(Solution.isPalindrome(121));
    }

    @Test
    void testIsPalindrome_givenSecondExample_returnFalse() {
        Assertions.assertFalse(Solution.isPalindrome(-121));
    }

    @Test
    void testIsPalindrome_givenThirdExample_returnFalse() {
        Assertions.assertFalse(Solution.isPalindrome(10));
    }
}
