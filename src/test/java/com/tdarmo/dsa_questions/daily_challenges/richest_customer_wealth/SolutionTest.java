package com.tdarmo.dsa_questions.daily_challenges.richest_customer_wealth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public abstract static class Solution {
        public static int maximumWealth(int[][] accounts) {
            int maxWealth = 0;
            for (int[] bankAccounts : accounts) {
                int wealth = 0;
                for (int account : bankAccounts) {
                    wealth += account;
                }

                if (wealth > maxWealth) maxWealth = wealth;
            }

            return maxWealth;
        }
    }

    @Test
    void testMaximumWealth_givenFirstExample_returnMaxWealth() {
        int[][] accounts = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };

        Assertions.assertEquals(6, Solution.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealth_givenSecondExample_returnMaxWealth() {
        int[][] accounts = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };

        Assertions.assertEquals(10, Solution.maximumWealth(accounts));
    }

    @Test
    void testMaximumWealth_givenThirdExample_returnMaxWealth() {
        int[][] accounts = new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        Assertions.assertEquals(17, Solution.maximumWealth(accounts));
    }
}
