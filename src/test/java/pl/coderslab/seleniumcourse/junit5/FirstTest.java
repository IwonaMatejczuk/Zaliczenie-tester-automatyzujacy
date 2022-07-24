package pl.coderslab.seleniumcourse.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    public void firstTest() {
        // given
        int a= 40;
        int b=2;
        // when
        int actual= a+b;
        //then  //metoda w JUnit, jaki chcemy mieć wynik w actual; porównanie
        assertEquals(42, actual);
    }
}
