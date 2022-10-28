package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UrinalsTest {

    @Test
    void numberOfPeopleInUrinal() {
    }

    @Test
    void stringTooLong() {
        String stringTooLongErrorMsg = "-1";
        String inputString = "100000000000000001100";
        assertEquals(stringTooLongErrorMsg, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST TWO EXECUTED =======");
    }

    @Test
    void invalidString() {
        String stringInvalidErrorMsg = "-1";
        String inputString = "abc";
        assertEquals(stringInvalidErrorMsg, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST THREE EXECUTED =======");
    }

}