package com.tdarmo.dsa_questions.data_structures.excel_column_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SolutionTest {
    public static abstract class Solution {
        public static int titleToNumber(String columnTitle) {
            int columnNumber = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                columnNumber *= 26;
                columnNumber += columnTitle.charAt(i) - 'A' + 1;
            }

            return columnNumber;
        }
    }

    @Test
    void testTitleToNumber_givenFirstExample_returnColumnNumber() {
        Assertions.assertEquals(1, Solution.titleToNumber("A"));
    }

    @Test
    void testTitleToNumber_givenSecondExample_returnColumnNumber() {
        Assertions.assertEquals(28, Solution.titleToNumber("AB"));
    }

    @Test
    void testTitleToNumber_givenThirdExample_returnColumnNumber() {
        Assertions.assertEquals(702, Solution.titleToNumber("ZZ"));
    }
}
