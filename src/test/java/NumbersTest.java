import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(4);
        int expected = 10;
        assertEquals(expected, actual);
    }
}