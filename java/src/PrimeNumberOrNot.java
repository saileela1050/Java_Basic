// palindrome number or not


public class PrimeNumberOrNot {

    public static void main(String[] args){

        int num=7;
        boolean isPrime=true;

        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2; i*i<=num; i++){
                if(num%i==0){
                    isPrime=true;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not palindrome number");
        }
    }
}
