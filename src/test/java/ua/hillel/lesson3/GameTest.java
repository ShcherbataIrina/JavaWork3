package ua.hillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void equalWords1(){
    Game newGame = new Game("apple");

    assertEquals("ap#############",newGame.play( "apricot") );

    }
    @Test
    void equalWords2(){
        Game test2 = new Game("mango");

        assertEquals("m##############",test2.play("mushroom"));

    }
    @Test
    void equalWords3(){
        Game test3 = new Game("pea");

        assertEquals("pea############",test3.play( "pear"));

    }
    @Test
    void equalWords4(){
        Game test4 = new Game("cherry");

        assertEquals("c##r###########", test4.play( "carrot"));

    }
    @Test
    void equalWords5(){
        Game test5 = new Game("apple");

        assertEquals("ap#############", test5.play( "apricot"));

    }
    @Test
    void equalWords6(){
        Game test5 = new Game("apple");

        assertEquals("###############", test5.play( "pea"));
    }
    @Test
    void equalWords7(){
        Game test5 = new Game("garlic");

        assertEquals("garlic", test5.play( "garlic"));
    }

}