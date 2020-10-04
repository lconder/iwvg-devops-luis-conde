package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 4);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction = new Fraction();
        fraction.setNumerator(2);
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction = new Fraction();
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
        fraction.setNumerator(10);
        assertFalse(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
        fraction.setNumerator(10);
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction candidate = new Fraction(2, 4);
        assertTrue(fraction.isEquivalent(candidate));
        candidate.setNumerator(3);
        assertFalse(fraction.isEquivalent(candidate));
    }

    @Test
    void testMultiply() {
        Fraction result = fraction.multiply(fraction);
        assertEquals(4, result.getNumerator());
        assertEquals(16, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction result = fraction.divide(fraction);
        assertEquals(8, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    void testAdd() {
        Fraction result = fraction.add(fraction);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());

        Fraction addend1 = new Fraction(1,2);
        Fraction addend2 = new Fraction(3,2);
        result = addend1.add(addend2);
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    @Test
    void testToString() {
        String expected = "Fraction{numerator=2, denominator=4}";
        assertEquals(expected, fraction.toString());
    }


}
