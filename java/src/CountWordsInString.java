// Count number of words in the given string

public class CountWordsInString {

    public static void main(String[] args){


        String str="java is easy to learn";

        String[] words=str.trim().split("\\s+");
        System.out.println("Number of words:" +words.length);
    }
}
