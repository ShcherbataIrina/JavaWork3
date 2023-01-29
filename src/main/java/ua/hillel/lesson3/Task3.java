package ua.hillel.lesson3;

public class Task3 {

    public String stringReverse(String str){
        String result = "";
        for(int i = str.length() -1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;

    }
}
