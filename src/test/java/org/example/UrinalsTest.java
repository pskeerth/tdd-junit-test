package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UrinalsTest {

    @Test
    void numberOfPeopleInUrinal() {
        System.out.println("Not yet implemented");
        String expectedOutput = "1";
        String inputString = "10001";
        assertEquals(expectedOutput, Urinals.countUrinals(inputString));
    }

    @Test
    void stringTooLong() {
        System.out.println("Not yet implemented");
        String stringTooLongErrorMsg = "String is too long";
        String inputString = "100000000000000001100";
        assertEquals(stringTooLongErrorMsg, Urinals.countUrinals(inputString));
    }

    @Test
    void invalidString() {
        System.out.println("Not yet implemented");
        String stringInvalidErrorMsg = "Invalid input";
        String inputString = "abc";
        assertEquals(stringInvalidErrorMsg, Urinals.countUrinals(inputString));
    }

}