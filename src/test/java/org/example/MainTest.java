package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void HelloTest(){
    assertTrue(true);
    }

    @Test
    void test_false_asserts_false(){
        assertFalse(false);
    }
}