// check an array contains duplicates or not

import java.util.HashSet;
import java.util.Set;

public class DuplicatesArray {

    public static void main(String[] args){

        int[] arr={1,2,3,6,9,3,4};
        Set<Integer> set= new HashSet<>();
        for(int num:arr) {
            if (!set.add(num)) {
                System.out.println("Duplicates found:" + num);
                return;
            }
        }
            System.out.println("No duplicates found");

    }
}
