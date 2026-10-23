
// number of digits in the given integer


public class NumberDigits {



    public static void main(String[] args){

        int num=12345765;

        int count=0;

        while(num>0){

            count ++;
            num=num/10;
        }
        System.out.println("Number of digits: " + count);
    }
}
