// MergeTwoArrays like union
import java.util.Arrays;

public class MergeTwoArrays {

   public static void main(String[] args){

       int[] arr1 = {1, 2, 3};
       int[] arr2 = {4, 5, 6};

       int[] result = new int[arr1.length + arr2.length];

       for (int i = 0; i < arr1.length; i++) {
           result[i] = arr1[i];
       }

       for (int i = 0; i < arr2.length; i++) {
           result[arr1.length + i] = arr2[i];
       }

       System.out.println(Arrays.toString(result));
   }
}


//
//        int arr1[]={1,7,6,2};
//        int arr2[]={2,8,3,4};
//
//        int[] result=new int[arr1.length+ arr2.length];
//
//        for(int i=0;i<arr1.length;i++){
//            result[i]=arr1[i];
//        }
//        for(int i=0;i< arr2.length;i++){
//            result[arr1.length+1]=arr2[i];
//        }
//        System.out.println("Merge two arrays:" +result);
//    }
//}




