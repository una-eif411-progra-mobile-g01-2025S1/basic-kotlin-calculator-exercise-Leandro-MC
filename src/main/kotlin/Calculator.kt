/**
 * File: Calculator.kt
 * Description: A simple calculator class that provides basic arithmetic operations.
 *
 * @author Leandro Mora
 * @version 1.0
 * @since 2025-02-02
 */

package org.example

/**
 * Calculator (Concrete Class)
 * This class provides basic arithmetic operations for addition, subtraction, multiplication, and division.
 *
 * @constructor Creates a new Calculator instance
 * @property add Adds two numbers together
 * @property subtract Subtracts one number from another
 * @property multiply Multiplies two numbers together
 * @property divide Divides one number by another
 * @throws IllegalArgumentException if division by zero is attempted
 *
 * Usage Example:
 * ```
 * val calc = Calculator()
 * val result = calc.add(1.0, 2.0)
 * println(result) // Output: 3.0
 * ``` *
 */

class Calculator {

    /**
     * Adds two numbers together.
     * @param a The first number
     * @param b The second number
     * @return The sum of the two numbers
     */
    fun add(a: Double, b: Double): Double = a + b

    /**
     * Subtracts one number from another.
     * @param a The first number
     * @param b The second number
     * @return The difference between the two numbers
     */
    fun subtract(a: Double, b: Double): Double = a - b

    /**
     * Multiplies two numbers together.
     * @param a The first number
     * @param b The second number
     * @return The product of the two numbers
     */
    fun multiply(a: Double, b: Double): Double = a * b

    /**
     * Divides one number by another.
     * @param a The dividend
     * @param b The divisor
     * @return The quotient of the two numbers
     * @throws IllegalArgumentException if division by zero is attempted
     */
    fun divide(a: Double, b: Double): Double = require(b != 0.0) { "Division by zero is not allowed" }.let { a / b}
}