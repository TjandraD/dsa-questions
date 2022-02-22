# Excel Sheet Column Number

## Question Source

LeetCode Problem No. 171 ([link](https://leetcode.com/problems/excel-sheet-column-number/))

## Problem Description

Given a string `columnTitle` that represents the column title as appear in an Excel sheet, return **its corresponding column number**.

For example:

```ignorelang
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
```

### Examples

**Example 1:**
```ignorelang
Input: columnTitle = "A"
Output: 1
```

**Example 2:**
```ignorelang
Input: columnTitle = "AB"
Output: 28
```

**Example 3:**
```ignorelang
Input: columnTitle = "ZY"
Output: 701
```

### Constraints

- `1 <= columnTitle.length <= 7`
- `columnTitle` consists only of uppercase English letters.
- `columnTitle` is in the range `["A", "FXSHRXW"]`.
