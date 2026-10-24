//find first non repeating character in the given string

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){

        String str="aabbcddee";
        Map<Character,Integer> map= new LinkedHashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("first non repeating element:" +ch);
                return;
            }
        }
    }
}
