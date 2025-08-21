package com.zipcode.exercises.task01;

/**
 * Task 1: Variable Declaration and Initialization
 * 
 * Complete the methods below by implementing the required functionality.
 * Each method has specific requirements detailed in the comments.
 * 
 * Run the tests with: mvn test -Dtest.pattern=task01
 */
public class VariableExercises {

    /**
     * Declare and initialize an integer variable with the value 42
     * @return the integer value 42
     */
    public int initializeInteger() {
        int value = 42;
        return value;
    }

    /**
     * Declare and initialize a double variable with the value 3.14159
     * @return the double value 3.14159
     */
    public double initializeDouble() {
        double value = 3.14159;
        return value;
    }

    /**
     * Declare and initialize a boolean variable with the value true
     * @return the boolean value true
     */
    public boolean initializeBoolean() {
        boolean value = true;
        return value;
    }

    /**
     * Declare and initialize a char variable with the value 'A'
     * @return the char value 'A'
     */
    public char initializeChar() {
        char value = 'A';
        return value;
    }

    /**
     * Declare and initialize a String variable with the value "Hello, World!"
     * @return the String value "Hello, World!"
     */
    public String initializeString() {
        String words = "Hello, World!";
        return words;
    }

    /**
     * Demonstrate variable reassignment
     * Start with value 10, then add 5, then multiply by 2
     * @return the final calculated value (should be 30)
     */
    public int variableReassignment() {
        int value = 10;
        value = value + 5;  // or value += 5;
        value = value * 2;  // or value *= 2;
        return value;
    }

    /**
     * Work with final variables (constants)
     * Create a final variable with value 100 and return it
     * @return the constant value 100
     */
    public int workWithConstants() {
        final int CONSTANT_VALUE = 100;
        return CONSTANT_VALUE;
    }

    /**
     * Type casting exercise
     * Convert the double 9.99 to an integer (truncating the decimal)
     * @return the integer value 9
     */
    public int typeCasting() {
        double originalValue = 9.99;
        return (int) originalValue;
    }
}
