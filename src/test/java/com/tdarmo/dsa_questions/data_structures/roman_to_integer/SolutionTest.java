package com.tdarmo.dsa_questions.data_structures.roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static class Solution {
        public static int romanToInt(String s) {
            int total = 0, current = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                switch (s.charAt(i)) {
                    case 'I': current = 1; break;
                    case 'V': current = 5; break;
                    case 'X': current = 10; break;
                    case 'L': current = 50; break;
                    case 'C': current = 100; break;
                    case 'D': current = 500; break;
                    case 'M': current = 1000; break;
                }

                // Check if current roman number is less than the next roman number
                // The roman number usually comes in 5 times bigger than before
                // So we could use * 2 - 4 to check both numbers
                if (current * 4 < total) {
                    total -= current;
                } else {
                    total += current;
                }
            }

            return total;
        }
    }

    @Test
    void testRomanToInt_givenFirstExample_returnCorrectInt() {
        Assertions.assertEquals(3, Solution.romanToInt("III"));
    }

    @Test
    void testRomanToInt_givenSecondExample_returnCorrectInt() {
        Assertions.assertEquals(58, Solution.romanToInt("LVIII"));
    }

    @Test
    void testRomanToInt_givenThirdExample_returnCorrectInt() {
        Assertions.assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }
}
