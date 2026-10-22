
// intersection of two arrays without duplicates


import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {


    public static void main(String[] args){

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 3, 5};

        Set<Integer> set= new HashSet<>();
        Set<Integer> result= new HashSet<>();

        for(int num:arr1){
            set.add(num);

        }
        for(int num:arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
