package pl.coderslab.seleniumcourse.junit5;

import org.junit.jupiter.api.*;

public class ExempleTest {
    @Test
    public void test1() {
        System.out.println("test1");
    }

    //wyłączenie testu
    @Disabled
    @Test
    public void test2() {
        System.out.println("test2");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("run before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("run after each test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("run before all test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("run after all test");
    }

}
