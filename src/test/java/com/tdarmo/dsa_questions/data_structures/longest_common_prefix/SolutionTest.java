package com.tdarmo.dsa_questions.data_structures.longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
    public static abstract class Solution {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            Arrays.sort(strs);
            StringBuilder prefix = new StringBuilder();
            String firstWord = strs[0];
            String secondWord = strs[strs.length - 1];

            for (int i = 0; i < firstWord.length(); i++) {
                if (firstWord.charAt(i) == secondWord.charAt(i)) {
                    prefix.append(firstWord.charAt(i));
                } else {
                    break;
                }
            }

            return String.valueOf(prefix);
        }
    }

    @Test
    void testLongestCommonPrefix_givenFirstExample_returnFl() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        Assertions.assertEquals("fl", Solution.longestCommonPrefix(strs));
    }

    @Test
    void testLongestCommonPrefix_givenSecondExample_returnEmptyString() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        Assertions.assertEquals("", Solution.longestCommonPrefix(strs));
    }
}
