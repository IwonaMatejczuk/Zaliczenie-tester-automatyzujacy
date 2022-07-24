package pl.coderslab.seleniumcourse.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void shouldBeAnExampleInUsingAssertions() {
        assertEquals(42,42);
        //porównanie z jaką dokładnością
        assertEquals(42.9,42.9, 0.01);

        //porównuje obiekty
        assertEquals(true, true, "wiadomość jak błąd");
        assertNotEquals(true, false);

        assertTrue(true);
        assertFalse(false);

        //porównuje referencje
        Object o= new Object();
        Object o2= o;
        assertSame(o, o2);

        assertArrayEquals(new int[]{1,2}, new int[] {1,2});

        assertThrows(NullPointerException.class,
                () -> {throw  new NullPointerException("exemlpe");});

    }
}
