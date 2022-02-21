package com.tdarmo.dsa_questions.algorithms.majority_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SolutionTest {
    public abstract static class Solution {
        public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> cache = new HashMap<>();
            int majority = 0;
            int count = 0;

            for (int num : nums) {
                if (cache.get(num) == null) {
                    cache.put(num, 1);
                } else {
                    count = cache.get(num);
                    count++;
                    cache.put(num, count);
                }

                if (majority != 0) {
                    int majorityCount = cache.get(majority);
                    if (count > majorityCount) majority = num;
                } else {
                    majority = num;
                }
            }

            return majority;
        }
    }

    @Test
    void testMajorityElement_givenFirstExample_returnThree() {
        int[] nums = new int[]{3, 2, 3};

        Assertions.assertEquals(3, Solution.majorityElement(nums));
    }

    @Test
    void testMajorityElement_givenSecondExample_returnTwo() {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};

        Assertions.assertEquals(2, Solution.majorityElement(nums));
    }
}
