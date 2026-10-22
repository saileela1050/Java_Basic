 //find largest number in the given array using for loop and array.
public class Largest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 76, 15};
        int largest = arr[0];
        for(int i = 0;i < arr.length; i++){
      //  for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}


//largest number in the given array
//public class Largest {
//
//    public static void main(String[] args) {
//        int[] arr = {10, 25, 7, 40, 15};
//
//        int largest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//
//        }
//
//        System.out.println("Largest element: " + largest);
//    }
//}