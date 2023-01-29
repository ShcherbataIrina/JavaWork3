package ua.hillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void findPosition1(){
        Task2 wordToFind1 = new Task2();

        assertEquals(1, wordToFind1.findWordPosition("java", "ava"));
    }

    @Test
    void findPosition2(){
        Task2 wordToFind2 = new Task2();

        assertEquals(-1, wordToFind2.findWordPosition("Apple", "Plant"));
    }

    @Test
    void findPosition3(){
        Task2 wordToFind3 = new Task2();

        assertEquals(6, wordToFind3.findWordPosition("beautiful", "ful"));
    }
    @Test
    void findPosition4(){
        Task2 wordToFind4 = new Task2();

        assertEquals(3, wordToFind4.findWordPosition("Garden", "den"));
    }

    @Test
    void findPosition5(){
        Task2 wordToFind5 = new Task2();

        assertEquals(0, wordToFind5.findWordPosition("mountain", "moun"));
    }

}