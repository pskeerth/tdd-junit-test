package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {



    /**
     * Tests the success scenario
     * @throws IOException
     */
    @Test
    void numberOfPeopleInUrinal() {
        String expectedOutput = "1";
        String inputString = "10001";
        assertEquals(expectedOutput, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST ONE EXECUTED =======");

    }

    /**
     *
     * @throws IOException
     */
    @Test
    void stringTooLong() {
        String stringTooLongErrorMsg = "String is too long";
        String inputString = "100000000000000001100";
        assertEquals(stringTooLongErrorMsg, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST TWO EXECUTED =======");

    }

    @Test
    void invalidString() {
        String stringInvalidErrorMsg = "Invalid input";
        String inputString = "abc";
        assertEquals(stringInvalidErrorMsg, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST THREE EXECUTED =======");

    }
}