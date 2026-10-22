// third largest value in the given array


public class ThirdLargestDistinct {

public static void main(String[] args){


    int[] arr={1,8,3,6,7,2};

    int first= Integer.MIN_VALUE;
    int second= Integer.MIN_VALUE;
    int third= Integer.MIN_VALUE;

    for(int num:arr){
        if(num>first){
            third=second;
            second=first;
            first=num;
        } else if (num>second && num!=first) {
            third=second;
            second=num;
            
        } else if (num>third && num!=second && num!=first) {
            third=num;
            
        }
    }


    if(third==Integer.MIN_VALUE){
        System.out.println("Third largest distinct element not found");
    } else{
        System.out.println("Third largest:" +third);
    }
}
}
