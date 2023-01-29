package ua.hillel.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //for (int i = 0; i < words.length; i++)
        //System.out.println(words[i]);
        
        Random random = new Random ();
        int index = random.nextInt(words.length);
        //System.out.print(words[index]);
        String word = words[index];
        System.out.println(word);

        Game newGame = new Game(word);
        
        Scanner user = new Scanner(System.in);
        boolean play= true ;
        while(play) {
            System.out.print("Input a word from array: ");
            String guess = String.valueOf(user.nextLine());
            //System.out.print(word);

            String result = newGame.play(guess);
            if (result.equals(word)) {
                System.out.println("Win!");
                play = false;
            } else System.out.println(result);
        }
    }
}
