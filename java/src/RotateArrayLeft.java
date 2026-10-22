
//rotate array to the left by one psoition

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args){


        int [] arr={1,2,3,4,6};

        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=first;
        System.out.println(Arrays.toString(arr));
    }
}
