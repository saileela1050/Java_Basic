
// reverse number


public class ReverseNumber {


    public static void main(String[] args){

        int n=1234;
        int reverse=0;

        while(n>0){

            int digits= n%10;

            reverse=reverse * 10 + digits;

            n=n/10;


        }

        System.out.println("Reverse Number:" +reverse);
    }
}
