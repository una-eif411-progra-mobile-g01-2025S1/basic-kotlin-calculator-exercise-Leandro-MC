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
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertEquals


/**
 * CalculatorTest (Test Class)
 * This class contains the unit tests for the Calculator class.
 *
 * Test Coverage Areas:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 * - Error cases
 * - Negative cases
 * - Long number cases
 */
class CalculatorTest {

    /**
     * Calculator instance used for testing.
     */
    private lateinit var calculator: Calculator

    /**
     * Test setup method.
     * Creates a new Calculator instance before each test.
     */
    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    /**
     * Test cleanup method.
     * Not necessary in this case.
     */
    @AfterEach
    fun tearDown() {
        // Not necessary in this case
    }

    /**
     * Test for the addition operation.
     */
    @Test
    @DisplayName("Addition Test")
    fun testAddition() {
        val result = calculator.add(1.0, 2.0)
        val expected = 3.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    /**
     * Test for the subtraction operation.
     */
    @Test
    @DisplayName("Subtraction Test")
    fun testSubtraction() {
        val result = calculator.subtract(2.0, 1.0)
        val expected = 1.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    /**
     * Test for the multiplication operation.
     */
    @Test
    @DisplayName("Multiplication Test")
    fun testMultiplication() {
        val result = calculator.multiply(2.0, 3.0)
        val expected = 6.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    /**
     * Test for the division operation.
     */
    @Test
    @DisplayName("Division Test")
    fun testDivision() {
        val result = calculator.divide(6.0, 3.0)
        val expected = 2.0
        assertEquals(expected, result, "Expected: $expected, Actual: $result")
    }

    /**
     * Test for error cases.
     */
    @Test
    @DisplayName("Error Cases Test - Division by Zero")
    fun testErrorCases() {
        // Division by zero should throw an exception
        try {
            calculator.divide(6.0, 0.0)
        } catch (e: IllegalArgumentException) {
            assertEquals("Division by zero is not allowed", e.message)
        }
    }

    /**
     * Test for negative cases.
     */
    @Test
    @DisplayName("Negative Cases Test")
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

    /**
     * Test for long number cases.
     */
    @Test
    @DisplayName("Long Number Cases Test")
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
