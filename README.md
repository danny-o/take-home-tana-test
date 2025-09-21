# TAKE HOME TEST TANA

**Language & Version**  
Java 21

---

## How to Compile and Run

Each question is implemented in its own `.java` file with an accompanying test file.

Example (for a file named `Question1_GetLongestString.java` is an accompanying file `Question1_GetLongestStringTest.java` ):

## How to Run
1. **Compile all files**
   ```bash
   javac *.java
   ```
   
2. Run the Test file for the desired Question
    e.g
   ```bash
   java Question1_GetLongestStringTest
   java Question2_GetFirstUniqueProductTest
   java Question3_GetDistanceBetweenClosestMinimumsTest
   java Question4_GetMostCommonStringsTest
   java Question5_RotateListTest
   ```

## Solution Explanations

### 1️⃣ Question 1 – Longest Valid String

**Problem**  
Return the longest string that:
- Has no adjacent identical characters.
- Uses only the allowed list of characters.

**Approach**  

- Iterate through the string list and for each string check:
  - All characters belong to the valid character set.
  - No consecutive  identical characters.

- Track and return longest string meeting the conditions .

---

### 2️⃣ Question 2 – First Unique Product

**Problem**  
Find the first product in an array that occurs exactly once.

**Approach**  
- Iterate through the string array and store the frequency of each string in a map.

- Look up the first string with a frequency of 1 from the map.

---

### 3️⃣ Question 3 – Distance Between Closest Minimums

**Problem**  
Given an integer array, find the smallest distance between any two occurrences of the minimum value.

**Approach**
- Loop once through the array and keep track of:
  - Smallest number.
  - The smallest distance between it and identified counterparts .
- return smallest distance

### 4️⃣ Question 4 – Three Most Common Words

**Problem**  
Return the three most frequent words in a sentence, sorted alphabetically.

**Approach**  
Split the sentence into words, use a frequency map to store occurrences
Sort the frequency map in descending order, pick the first 3 entries and order them alphabetically.

---

### 5️⃣ Question 5 – Rotate a List to the Right by *n* Positions

**Problem**  
Rotate a list so that every element moves *n* places to the right.  
Example:  
`"ID_A01" -> … -> "ID_A06"` with `n = 2` →  
`"ID_A05" -> "ID_A06" -> "ID_A01" -> …`

**Approach**  
- Create new list then:
- Add all elements whose indices are expected to decrease then those whose indices are expected to increase and return the new list


