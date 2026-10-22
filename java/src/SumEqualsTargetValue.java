
//two numbers sum equals to target value

import java.util.HashSet;
import java.util.Set;

public class SumEqualsTargetValue {

    public static void main(String[] args){

        int[] arr={2,7,11,15};
        int target=9;

        Set<Integer> set= new HashSet<>();

        for(int num:arr){
            int expected= target-num;

            if(set.contains(expected)){
                System.out.println(expected + "+" +num +"=" +target);
                return;
            }
            set.add(num);
        }

    }
}
