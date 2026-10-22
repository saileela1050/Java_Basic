public class MaximumDifference {

    public static void main(String[] args){

        int[] arr={7,6,8,9,3,2,1};

        int min=arr[0];
        int maxDifference=0;

        for(int i=1;i<arr.length;i++){

            int diffence=arr[i]-min;

            if(diffence>maxDifference){
                maxDifference=diffence;

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Maximum Diference:" +maxDifference);
    }
}
