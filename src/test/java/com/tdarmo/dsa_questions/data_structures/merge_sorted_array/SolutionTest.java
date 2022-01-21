package com.tdarmo.dsa_questions.data_structures.merge_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[i - m];
            }

            sortArray(nums1);
            return nums1;
        }

        public static void sortArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

    @Test
    void testMerge_givenFirstExample_returnSortedExample() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};

        int[] result = Solution.merge(nums1, 3, nums2, 3);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testMerge_givenSecondExample_returnSortedExample() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] expected = new int[]{1};

        int[] result = Solution.merge(nums1, 1, nums2, 0);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testMerge_givenThirdExample_returnSortedExample() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] expected = new int[]{1};

        int[] result = Solution.merge(nums1, 0, nums2, 1);

        Assertions.assertArrayEquals(expected, result);
    }
}
