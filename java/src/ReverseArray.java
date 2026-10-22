////reverse the given array
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={10,7,3,90,100};
       // int arr[]={100,256,876,908,143};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        System.out.println( Arrays.toString(arr));
    }
}

//import java.util.Arrays;
//
//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}