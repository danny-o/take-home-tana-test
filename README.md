# TAKE HOME TEST TANA

**Language & Version**  
Java 21

---

## How to Compile and Run

Each question is implemented in its own `.java` file with an accompanying test file.

Example (for a file named `Question1_GetLongestString.java` is an accompanying file `Test_Question1_GetLongestString.java` ):


## How to Run
**Compile all files**
   ```bash
      javac *.java
   ```

### Running files to each question
Tests to each question can be run by calling `java {file_name}` 
   e.g.
   ```bash
       java Question1_GetLongestString
       java Question2_Find_First_Unique_Product
       java Question3_Smallest_Distance_Between_Minimums
       java Question4_Three_Most_Common_Strings
       java Question5_RotateList_To_The_Right
   ```
### Running all tets
All tests associated with the questions can be run at the same time by calling:

   ```bash
       java Test_Combined_Tests
   ```

## Solution Explanations

### 1️⃣ Question 1 – Longest Valid String

**Problem**  
Return the longest string that:
- Has no repetitive identical characters.
- Contains only the allowed list of characters.

**Approach**  
- Sort the string array in descending order of string length
- Iterate through the string list and for each string check:
  - That all characters belong to the valid character set.
  - No consecutive  identical characters.

- return the first string that meets the conditions .

---

### 2️⃣ Question 2 – First Unique Product

**Problem**  
Find the first product in an array that occurs exactly once.

**Approach**  
- Iterate through the string array and store the frequency of each string in a map.

- From the map, Look up the first string with a frequency of 1.

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
- Add all elements expected to move to the beginning of the list then elements expected to move to the end of the list


