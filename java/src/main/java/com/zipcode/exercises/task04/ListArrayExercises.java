/home/kayanr/Documents/Dev/Spring-EmployeeDirectorypackage com.zipcode.exercises.task04;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 4: Lists and Arrays
 * 
 * Complete the methods below by implementing the required functionality.
 * Each method has specific requirements detailed in the JavaDoc comments.
 * 
 * Java provides both arrays (fixed-size) and Lists (dynamic collections).
 * This task covers common operations on both data structures.
 * 
 * Run tests with: mvn test -Dtest=ListArrayExercisesTest
 */
public class ListArrayExercises {

    /**
     * Array basics - creation and initialization
     * Create an array of integers from 1 to n (inclusive)
     * 
     * @param n The size of the array and upper limit
     * @return Array containing integers from 1 to n
     */
    public int[] createNumberArray(int n) {
        if(n <= 0){
            return new int[0];
        }

        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = i + 1;
        }
        return numArr;
    }

    /**
     * Array element access and modification
     * Double all elements in the array (modify in place)
     * 
     * @param array The array to modify
     */
    public void doubleArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    /**
     * Array searching
     * Find the index of the first occurrence of target in the array
     * Return -1 if not found
     * 
     * @param array The array to search
     * @param target The value to find
     * @return Index of target or -1 if not found
     */
    public int findElement(int[] array, int target) {
        if (array == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Array aggregation
     * Calculate the average of all elements in the array
     * Return 0.0 if array is empty
     * 
     * @param array Array of numbers
     * @return Average value as double
     */
    public double calculateAverage(int[] array) {
        if(array == null || array.length == 0){
            return 0.0;
        }
        int sum = 0;

        for (int num : array) {
             sum += num;
        }

        return (double) sum / array.length;
    }

    /**
     * Array filtering
     * Return a new array containing only the even numbers from the input array
     *
     * @param array Input array
     * @return New array with only even numbers
     */
    public int[] filterEvenNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] filteredArray = new int[count];
        int j = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                filteredArray[j++] = num;
            }
        }
        return filteredArray;
    }

    /**
     * ArrayList basics
     * Create an ArrayList and add numbers from 1 to n
     * 
     * @param n Upper limit for numbers to add
     * @return ArrayList containing numbers 1 to n
     */
    public List<Integer> createNumberList(int n) {
        List<Integer> numlist = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numlist.add(i);
        }
        return numlist;
    }

    /**
     * List manipulation
     * Remove all occurrences of a specific value from the list
     * 
     * @param list The list to modify
     * @param value The value to remove
     */
    public void removeValue(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.remove(i);
                //So that the next element is not skipped, adjust the index by decrementing i
                i--;
            }
        }
    }

    /**
     * List sorting
     * Sort the list in ascending order (modify the original list)
     * 
     * @param list The list to sort
     */
    public void sortList(List<Integer> list) {
        if (list == null || list.size() < 2) {
            return;
        }

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }

    /**
     * List merging
     * Merge two sorted lists into one sorted list
     * 
     * @param list1 First sorted list
     * @param list2 Second sorted list
     * @return New merged and sorted list
     */
    public List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        int value1 = list1.size(),  value2 = list2.size();
        List<Integer> mergedSortedList = new ArrayList<>(value1 + value2);

        int i = 0, j = 0;
        while (i < value1 && j < value2) {
            if (list1.get(i) <= list2.get(j)) {
                mergedSortedList.add(list1.get(i++));
            } else {
                mergedSortedList.add(list2.get(j++));
            }
        }
        while(i < value1) {
        mergedSortedList.add(list1.get(i++));
        }

        while(j < value2) {
            mergedSortedList.add(list2.get(j++));
        }


        return mergedSortedList;
    }

    /**
     * Array rotation
     * Rotate array to the right by k positions
     * Example: [1,2,3,4,5] rotated by 2 becomes [4,5,1,2,3]
     * 
     * @param array Array to rotate (modify in place)
     * @param k Number of positions to rotate right
     */
    public void rotateArray(int[] array, int k) {
        int n = array.length;
        if (n == 0) {
            return;
        }
        //Makes sure k is not bigger than the array size
        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            //Move each element to its new spot after rotating, wrapping
            //around the end
            temp[(i + k) % n] = array[i];
        }

        //Copy element back into the original array
        for(int i = 0; i < n; i++){
            array[i] = temp[i];
        }

    }

    /**
     * Subarray operations
     * Find the maximum sum of any contiguous subarray (Kadane's algorithm)
     * 
     * @param array Input array (may contain negative numbers)
     * @return Maximum sum of contiguous subarray
     */
    public int maxSubarraySum(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    /**
     * Array comparison
     * Check if two arrays contain the same elements in the same order
     * 
     * @param array1 First array
     * @param array2 Second array
     * @return true if arrays are equal, false otherwise
     */
    public boolean arraysEqual(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return array1 == array2;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2D array operations
     * Create a 2D array (matrix) filled with a specific value
     * 
     * @param rows Number of rows
     * @param cols Number of columns
     * @param value Value to fill the matrix with
     * @return 2D array filled with the specified value
     */
    public int[][] createMatrix(int rows, int cols, int value) {
       int[][] matrixArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixArray[i][j] = value;
            }
        }

        return matrixArray;
    }

    /**
     * Matrix operations
     * Calculate the sum of all elements in a 2D array
     * 
     * @param matrix 2D array of integers
     * @return Sum of all elements
     */
    public int matrixSum(int[][] matrix) {
        int sum = 0;

        if(matrix == null || matrix.length == 0){
            return 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Array statistics
     * Find the second largest element in the array
     * Return Integer.MIN_VALUE if array has fewer than 2 distinct elements
     * 
     * @param array Input array
     * @return Second largest element
     */
    public int findSecondLargest(int[] array) {
      if(array == null || array.length < 2){
          return Integer.MIN_VALUE;
      }

      int largestNum = Integer.MAX_VALUE;
      int secondLargestNum = Integer.MIN_VALUE;


      for (int num : array) {
          if (num  > largestNum) {
              secondLargestNum = largestNum;
              largestNum = num;
          }else if (num < largestNum && num > secondLargestNum ) {
              secondLargestNum = num;
          }
      }


      return secondLargestNum;
    }

    /**
     * List intersection
     * Find common elements between two lists
     * Return a new list containing elements that appear in both lists
     * 
     * @param list1 First list
     * @param list2 Second list
     * @return List of common elements (no duplicates)
     */
    public List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
       List<Integer> intersectionList = new ArrayList<>();

       for(int i = 0; i < list1.size(); i++){
           int num1 = list1.get(i);

           if(list2.contains(num1) && !intersectionList.contains(num1)){
               intersectionList.add(num1);
           }
       }
      return intersectionList;
    }
}
