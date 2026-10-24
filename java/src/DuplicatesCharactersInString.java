// duplicate characters in the given string


import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesCharactersInString {

    public static void main(String[] args){

        String str="programming";

        Set<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
         set.add(ch);

        }
        StringBuilder result= new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }
        System.out.println(result);
    }
}
