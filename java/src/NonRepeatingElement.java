// checking first non repeating element in the given array

import java.util.HashMap;
import java.util.Map;


public class NonRepeatingElement {
    public static void main(String[] args){
        int[] arr= {2,8,6,2,3,8,9};
         Map<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println("First non repeating element:" +num);
                return;
            }
        }
        System.out.println("No non-repeating element found");
    }
}
