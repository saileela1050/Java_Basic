// count frequency of each word


import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyWord {

    public static void main(String[] args){

      String str="java spring java sql spring java";

      String[] words=str.split("\\s+");

      Map<String,Integer> map= new LinkedHashMap<>();

      for(String word :words){
          map.put(word,map.getOrDefault(word,0)+1);
          }
            System.out.println(map);
      }
    }

