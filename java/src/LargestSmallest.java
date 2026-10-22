// largest and smallest numbers in array

public class LargestSmallest {
    public static void main(String[] args){

        int[] arr={3,6,1,9,65};
        int largest=arr[0];
        int smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("largest:" +largest);
        System.out.println("smallest:" +smallest);

    }
}
