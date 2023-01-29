package ua.hillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void wordPalindrome1(){
        Task4 word1 = new Task4();

        assertEquals(true,word1.isPalindrome("alla"));
    }
    @Test
    void wordPalindrome2(){
        Task4 word2 = new Task4();

        assertEquals(true,word2.isPalindrome("ere"));
    }
    @Test
    void wordPalindrome3(){
        Task4 word3 = new Task4();

        assertEquals(false,word3.isPalindrome("flower"));
    }
    @Test
    void wordPalindrome4(){
        Task4 word4 = new Task4();

        assertEquals(true,word4.isPalindrome("noon"));
    }
    @Test
    void wordPalindrome5(){
        Task4 word5 = new Task4();

        assertEquals(true,word5.isPalindrome("wow"));
    }

}