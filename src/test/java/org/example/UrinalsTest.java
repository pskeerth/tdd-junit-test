package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UrinalsTest {

    @Test
    void numberOfPeopleInUrinal() {
    }

    @Test
    void stringTooLong() {
    }

    @Test
    void invalidString() {
        String stringInvalidErrorMsg = "-1";
        String inputString = "abc";
        assertEquals(stringInvalidErrorMsg, Urinals.countUrinals(inputString));
        System.out.println("====== Poornima Sathya Keerthi == TEST THREE EXECUTED =======");
    }

}