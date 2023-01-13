import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator testCalculator = new Calculator();

    @Test
    void nothing() {
    }

    @Test
    void sumOfNumbers() {
        int current = Calculator.sumOfNumbers(3, 1);
        assertEquals(4, current);
    }

    @Test
    void divide1() {
        double current = Calculator.divide(1,2);
        assertEquals(0.5, current);
    }

    @Test
    void divide2() {
        double current = Calculator.divide(4,2);
        assertEquals(2,current);
    }

    @Test
    void divide3() throws Exception {
        double current = Calculator.divide(4,0);
        assertEquals(0, current);
    }

    @Test
    void divide4() {
        double current = Calculator.divide(1,3);
        assertEquals(0.33, current, 0.01);
    }

    @Test
    void los() {
        int current = Calculator.los(1,100);
        boolean ifOk = true;
        if(current < 1 || current >100)
        {
            ifOk = false;
        }
        assertTrue(ifOk);
    }

    @Test
    void szyfr1() {
        String current = Calculator.szyfr("abcd");
        assertEquals("acbd", current);
    }

    @Test
    void szyfr2() {
        String current = Calculator.szyfr("a");
        assertEquals("a", current);
    }

    @Test
    void szyfr3() {
        String current = Calculator.szyfr("a bc");
        assertEquals("ab c", current);
    }

    @Test
    void szyfr4() {
        String current = Calculator.szyfr("abcde    ");
        assertEquals("ad be c  ", current);
    }

    @Test
    void szyfr5() {
        String current = Calculator.szyfr("ad be c ");
        assertEquals("abcde    ", current);
    }
}