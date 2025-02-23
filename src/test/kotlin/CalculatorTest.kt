/**
 * File: CalculatorTest.kt
 * Description: This file contains the tests for the Calculator class.
 *
 * @author Leandro Mora
 * @version 1.0
 * @since 2025-02-02
 */

import org.example.Calculator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.AfterEach
import kotlin.test.assertEquals

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @AfterEach
    fun tearDown() {
        // Not necessary in this case
    }

    // TODO: Create your addition tests
    @Test
    fun testAddition() {
        val result = calculator.add(1.0, 2.0)
        val expected = 3.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    // TODO: Create your subtraction tests
    @Test
    fun testSubtraction() {
        val result = calculator.subtract(2.0, 1.0)
        val expected = 1.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    // TODO: Create your multiplication tests
    @Test
    fun testMultiplication() {
        val result = calculator.multiply(2.0, 3.0)
        val expected = 6.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    // TODO: Create your division tests
    @Test
    fun testDivision() {
        val result = calculator.divide(6.0, 3.0)
        val expected = 2.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    // TODO: Create error case tests
    @Test
    fun testErrorCases() {
        // Division by zero should throw an exception
        try {
            calculator.divide(6.0, 0.0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Division by zero is not allowed", e.message)
        }
    }

    @Test
    fun testNegativeCases() {
        val result = listOf(
            calculator.add(-1.0, -2.0),
            calculator.subtract(-2.0, -1.0),
            calculator.multiply(-2.0, -3.0),
            calculator.divide(-6.0, -3.0)
        )

        val expected = listOf(-3.0, -1.0, 6.0, 2.0)

        result.forEachIndexed { index, value ->
            assertEquals(expected[index], value, "Expected: ${expected[index]}, Actual: $value")
        }
    }

    @Test
    fun testLongCases() {
        val longNumber = Double.MAX_VALUE / 4

        val result = listOf(
            calculator.add(longNumber, longNumber),
            calculator.subtract(longNumber, longNumber / 2),
            calculator.multiply(longNumber, 2.0),
            calculator.divide(longNumber, 2.0)
        )

        val expected = listOf(longNumber * 2, longNumber / 2, longNumber * 2, longNumber / 2)

        result.forEachIndexed { index, value ->
            assertEquals(expected[index], value, "Expected: ${expected[index]}, Actual: $value")
        }
    }
}