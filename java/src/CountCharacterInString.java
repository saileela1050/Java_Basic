// count each character in string

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterInString {

    public static void main(String[] args){

        String str="hello";
        Map<Character,Integer> map= new LinkedHashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }

}
