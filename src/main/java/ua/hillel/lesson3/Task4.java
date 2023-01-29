package ua.hillel.lesson3;

public class Task4 {
    public boolean isPalindrome(String word) {
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        String reverseWord = buffer.toString();
        if (word.equals(reverseWord)) {
            return true;
        } else return false;

    }
}
