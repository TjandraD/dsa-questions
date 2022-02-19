package com.tdarmo.dsa_questions.data_structures.roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Objects;

public class SolutionTest {
    public static class Solution {
        HashMap<String, Integer> ROMAN_LIST = new HashMap<>();

        public Solution() {
            ROMAN_LIST.put("I", 1);
            ROMAN_LIST.put("V", 5);
            ROMAN_LIST.put("X", 10);
            ROMAN_LIST.put("L", 50);
            ROMAN_LIST.put("C", 100);
            ROMAN_LIST.put("D", 500);
            ROMAN_LIST.put("M", 1000);
        }

        public int romanToInt(String s) {
            String[] inputArray = s.split("");

            int i = 0;
            for (int j = 0; j < inputArray.length; j++) {
                String roman = inputArray[j];

                if (Objects.equals(roman, "I") && j != inputArray.length - 1) {
                    String next = inputArray[j + 1];
                    if (Objects.equals(next, "V")) {
                        i += 4;
                        j++;
                        continue;
                    } else if (Objects.equals(next, "X")) {
                        i += 9;
                        j++;
                        continue;
                    }
                } else if (Objects.equals(roman, "X") && j != inputArray.length - 1) {
                    String next = inputArray[j + 1];
                    if (Objects.equals(next, "L")) {
                        i += 40;
                        j++;
                        continue;
                    } else if (Objects.equals(next, "C")) {
                        i += 90;
                        j++;
                        continue;
                    }
                } else if (Objects.equals(roman, "C") && j != inputArray.length - 1) {
                    String next = inputArray[j + 1];
                    if (Objects.equals(next, "D")) {
                        i += 400;
                        j++;
                        continue;
                    } else if (Objects.equals(next, "M")) {
                        i += 900;
                        j++;
                        continue;
                    }
                }

                i += ROMAN_LIST.get(roman);
            }

            return i;
        }
    }

    @Test
    void testRomanToInt_givenFirstExample_returnCorrectInt() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void testRomanToInt_givenSecondExample_returnCorrectInt() {
        Solution solution = new Solution();
        Assertions.assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void testRomanToInt_givenThirdExample_returnCorrectInt() {
        Solution solution = new Solution();
        Assertions.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
