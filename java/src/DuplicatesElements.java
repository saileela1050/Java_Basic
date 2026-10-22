// duplicate elements in array

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElements {

    public static void main(String[] args){
        int[] arr={9,7,4,9,8,0};

        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();

        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
       for(int num:duplicates) {
           System.out.println("Duplicates:" + num);
       }
    }
}
