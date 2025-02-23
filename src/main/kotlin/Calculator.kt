/**
 * File: Calculator.kt
 * Description: A simple calculator class that provides basic arithmetic operations.
 *
 * @author Leandro Mora
 * @version 1.0
 * @since 2025-02-02
 */

package org.example

class Calculator {
    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double = require(b != 0.0) { "Division by zero is not allowed" }.let { a / b}
}