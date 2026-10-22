import java.util.Arrays;
// removing duplicates in the given array

//public class RemoveDuplicates {
//    public static void main(String[] args){
//        int[] arr={6,7,6,8,2};
//        int index=1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=arr[index-1]){
//                arr[index]=arr[i];
//                index++;
//            }
//        }
//        System.out.println("Count:" +index);
//        System.out.println("Unique elements:" + Arrays.toString(Arrays.copyOf(arr,index)));
//    }
//}
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3,3,4,4,5};
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Count: " + index);
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(arr,index)));
    }
}
