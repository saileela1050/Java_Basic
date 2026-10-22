//smallest element in the given array using for loop and array.

public class Smallest {
    public static void main(String[] args){
       // int arr[]={10,87,8,2};
        int[] arr = {12, 5, 30, 2, 18};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
            System.out.println("Smallest element:" +smallest);

    }
}
