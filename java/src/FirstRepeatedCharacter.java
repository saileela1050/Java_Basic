// first repeated character in the given string


import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args){

        String str="programming";

        Set<Character> set= new LinkedHashSet<>();
        for(char ch:str.toCharArray()){

            if(!set.add(ch)){
                System.out.println("First repeated character:" +ch);
                return;
            }

        }
    }
}
