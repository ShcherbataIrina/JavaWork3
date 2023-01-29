package ua.hillel.lesson3;

public class Task1 {

    public int findSymbolOccurance(String str, char symbol) {
        int count = 0;

            for (char element : str.toCharArray()){
                if (element == symbol) count++;

        }
        return count;
    }
}
