package com.zipcode.exercises.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Task 3: Loops
 * 
 * Complete the methods below by implementing the required functionality.
 * Each method has specific requirements detailed in the JavaDoc comments.
 * 
 * Java supports several types of loops:
 * - for loops (traditional and enhanced/for-each)
 * - while loops
 * - do-while loops
 * 
 * Run tests with: mvn test -Dtest.pattern=task03
 */
public class LoopExercises {

    /**
     * Basic for loop
     * Calculate the sum of numbers from 1 to n (inclusive)
     * 
     * @param n The upper limit (inclusive)
     * @return The sum of numbers from 1 to n
     */
    public int calculateSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * While loop
     * Count how many times you can divide n by 2 until it becomes 1 or less
     * 
     * @param n The number to divide
     * @return The number of divisions performed
     */
    public int countDivisions(int n) {
        int count = 0;
        while(n > 1){
            n = n / 2;
            count++;
        }
        return count;
    }

    /**
     * Do-while loop
     * Generate a string that repeats a character until the string length reaches targetLength
     * Always add the character at least once
     * 
     * @param character The character to repeat
     * @param targetLength The desired string length
     * @return A string with the character repeated
     */
    public String repeatCharacter(char character, int targetLength) {
        String repeatCharacterStr = "";
        do {
            repeatCharacterStr = repeatCharacterStr + character;
        } while (repeatCharacterStr.length() < targetLength);
        return repeatCharacterStr;
    }

    /**
     * Enhanced for loop (for-each)
     * Find the maximum value in an array
     * Return Integer.MIN_VALUE if array is empty
     * 
     * @param numbers Array of integers
     * @return The maximum value in the array
     */
    public int findMaximum(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        for(int number : numbers) {
            if(number > max)
                {max = number;
                }
        }
        return max;
    }

    /**
     * Nested loops
     * Create a multiplication table as a 2D array
     * table[i][j] should contain (i+1) * (j+1)
     *
     * @param size The size of the square table
     * @return A 2D array representing the multiplication table
     */
    public int[][] createMultiplicationTable(int size) {
        // Implemented this method using nested for loops
        if (size <= 0) {
            return new int[0][0];
        }
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;
    }

    /**
     * Loop with break statement
     * Find the first number in the array that is divisible by divisor
     * Return -1 if no such number is found
     *
     * @param numbers Array of integers to search
     * @param divisor The divisor to check against
     * @return The first number divisible by divisor, or -1 if none found
     */
    public int findFirstDivisible(int[] numbers, int divisor) {
        // Implemented this method using a loop with break
        int firstDivisibleNum = -1;
        for (int number : numbers) {
            if (number % divisor == 0) {
                firstDivisibleNum = number;
                break;
            }
        }
        return firstDivisibleNum;
    }

    /**
     * Loop with continue statement
     * Count how many even numbers are in the array
     * Skip odd numbers using continue
     * 
     * @param numbers Array of integers
     * @return Count of even numbers
     */
    public int countEvenNumbers(int[] numbers) {
        // Implemented this method using a loop with continue

        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                continue;
            }
            count++;
        }
        return count;
    }

    /**
     * Complex loop logic
     * Generate the Fibonacci sequence up to n terms
     * Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, ...
     * 
     * @param n Number of terms to generate
     * @return List containing the Fibonacci sequence
     */
    public List<Integer> generateFibonacci(int n) {
        // Implemented this method using loops
        List<Integer> fibonacciList = new ArrayList<>();

        if(n <= 0){
           return fibonacciList;
        }

        fibonacciList.add(0);

        if(n == 1){
            return fibonacciList;
        }

        fibonacciList.add(1);

        for (int i = 2; i < n; i++) {
            int nextValue = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextValue);
        }

        return fibonacciList;
    }

    /**
     * String processing with loops
     * Count the number of vowels in a string (case-insensitive)
     * Vowels: a, e, i, o, u
     * 
     * @param text The string to analyze
     * @return Number of vowels found
     */
    public int countVowels(String text) {
        // Implemented this method using a loop
        int count = 0;
        text = text.toLowerCase();

        for (char letter : text.toCharArray()) {
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                count++;
        }
        return count;
    }

    /**
     * Advanced loop pattern
     * Check if a number is prime using trial division
     * A prime number is only divisible by 1 and itself
     * 
     * @param number The number to check
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        //Implemented this method using loops
        // Hint: Check divisibility from 2 to sqrt(number)

        if(number <= 1) {
            return false;
        }

        int sqrtNum = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrtNum; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Pattern generation with nested loops
     * Generate a right triangle pattern of asterisks
     * For n=4:
     * *
     * **
     * ***
     * ****
     * 
     * @param height The height of the triangle
     * @return A string representing the triangle pattern
     */
    public String generateTrianglePattern(int height) {
        // TODO: Implement this method using nested loops
        throw new UnsupportedOperationException("Method not implemented yet");
    }

    /**
     * Array manipulation with loops
     * Reverse an array in place (modify the original array)
     * 
     * @param array The array to reverse
     */
    public void reverseArray(int[] array) {
        // TODO: Implement this method using loops
        // Hint: Swap elements from both ends moving inward
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
