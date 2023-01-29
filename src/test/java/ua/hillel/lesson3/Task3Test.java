package ua.hillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void reverse1(){
        Task3 reverse1 = new Task3();

        assertEquals("olleH",reverse1.stringReverse("Hello"));
    }
    @Test
    void reverse2(){
        Task3 reverse2 = new Task3();

        assertEquals("egalliV",reverse2.stringReverse("Village"));
    }  @Test
    void reverse3(){
        Task3 reverse3 = new Task3();

        assertEquals("letoH",reverse3.stringReverse("Hotel"));
    }
    @Test
    void reverse4(){
        Task3 reverse4 = new Task3();

        assertEquals("ollA",reverse4.stringReverse("Allo"));
    }  @Test
    void reverse5(){
        Task3 reverse5 = new Task3();

        assertEquals("tnalP",reverse5.stringReverse("Plant"));
    }


}