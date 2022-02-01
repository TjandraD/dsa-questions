package com.tdarmo.dsa_questions.daily_challenges.best_time_stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static abstract class Solution {
        public static int maxProfit(int[] prices) {
            int lowestPrice = prices[0];
            int profit = 0;
            for (int price : prices) {
                if (price < lowestPrice) {
                    lowestPrice = price;
                    continue;
                } else {
                    if ((price - lowestPrice) > profit) profit = price - lowestPrice;
                }
            }

            return profit;
        }
    }

    @Test
    void testMaxProfit_givenFirstExample_returnCorrectInt() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        Assertions.assertEquals(5, Solution.maxProfit(prices));
    }

    @Test
    void testMaxProfit_givenSecondExample_returnCorrectInt() {
        int[] prices = new int[]{7, 6, 4, 3, 1};

        Assertions.assertEquals(0, Solution.maxProfit(prices));
    }
}
