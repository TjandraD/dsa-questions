package com.tdarmo.dsa_questions.algorithms.first_bad_version;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static boolean isBadVersion(int version, int bad) {
            return version >= bad;
        }

        public static int firstBadVersion(int n, int bad) {
            int startIndex = 0;

            while (n > startIndex) {
                int mid = startIndex + (n - startIndex) / 2;
                if (isBadVersion(mid, bad)) {
                    n = mid;
                } else {
                    startIndex = mid + 1;
                }
            }

            return startIndex;
        }
    }

    @Test
    void testIsBadVersion_givenVersionOne_returnTrue() {
        Assertions.assertFalse(Solution.isBadVersion(1, 2));
    }

    @Test
    void testFirstBadVersion_givenFirstExample_returnFour() {
        Assertions.assertEquals(4, Solution.firstBadVersion(5, 4));
    }

    @Test
    void testFirstBadVersion_givenSecondExample_returnOne() {
        Assertions.assertEquals(1, Solution.firstBadVersion(1, 1));
    }
}
