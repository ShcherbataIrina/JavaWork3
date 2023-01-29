package ua.hillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

        @Test
        void shouldFindSymbol_O(){
            Task1 findSymbolO = new Task1();

            assertEquals(2, findSymbolO.findSymbolOccurance("look",'o'));
        }
    @Test
    void shouldFindSymbol_E(){
        Task1 findSymbolE = new Task1();

        assertEquals(2, findSymbolE.findSymbolOccurance("see",'e'));
    }
    @Test
    void shouldFindSymbol_L(){
        Task1 findSymbolL = new Task1();

        assertEquals(3, findSymbolL.findSymbolOccurance("hillel",'l'));
    }
    @Test
    void shouldFindSymbol_M(){
        Task1 findSymbolM = new Task1();

        assertEquals(1, findSymbolM.findSymbolOccurance("mountain",'m'));
    }
    @Test
    void shouldFindSymbol_R(){
        Task1 findSymbolR = new Task1();

        assertEquals(2, findSymbolR.findSymbolOccurance("river",'r'));
    }

    }
