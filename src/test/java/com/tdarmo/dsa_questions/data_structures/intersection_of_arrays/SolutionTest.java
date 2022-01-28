package com.tdarmo.dsa_questions.data_structures.intersection_of_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class SolutionTest {
    public static class Solution {
        public static int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length == 0) return nums1;
            if (nums2.length == 0) return nums2;

            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int count1 = 0, count2 = 0, countResult = 0;
            while (count1 < nums1.length && count2 < nums2.length) {
                if (nums1[count1] < nums2[count2]) {
                    count1++;
                } else if (nums2[count2] < nums1[count1]) {
                    count2++;
                } else if (nums1[count1] == nums2[count2]) {
                    nums1[countResult++] = nums1[count1];
                    count1++;
                    count2++;
                }
            }

            return Arrays.copyOfRange(nums1, 0, countResult);
        }
    }

    @Test
    void testIntersect_givenFirstExample_returnIntersectionList() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2, 2};

        int[] result = Solution.intersect(nums1, nums2);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testIntersect_givenSecondExample_returnIntersectionList() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] expected = new int[]{4, 9};

        int[] result = Solution.intersect(nums1, nums2);

        Assertions.assertArrayEquals(expected, result);
    }
}
