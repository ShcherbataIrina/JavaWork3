package ua.hillel.lesson3;

public class Game {
private final String word;

    public Game(String word) {
        this.word = word;
    }

    public String play( String guess){
        if(guess.equals(word)){return word;}
        int MAX_LENGHT = 15;

        String result = "";
        for (int i = 0; i < Math.min(word.length(), guess.length()); i++) {
            if (guess.charAt(i) == word.charAt(i)){
                result += word.charAt(i);
            }
            else result+= "#";
        }

        while (result.length() < MAX_LENGHT) result += "#";

        return result;
    }
}
