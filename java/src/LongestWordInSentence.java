// longest word in the given string

public class LongestWordInSentence {

    public static void main(String[] args){

        String str= "java is easybytes to learn";

        String[] words=str.split("\\s+");
        String longest="";

        for(String word:words){
            if(words.length>longest.length()){
                longest=word;
            }
        }
       System.out.println("Longest Word:" +longest);
    }
}
