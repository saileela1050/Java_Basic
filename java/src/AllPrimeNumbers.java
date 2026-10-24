// Print All Prime Numbers in a Given Range

public class AllPrimeNumbers {

    public static void main(String[] args){

        int start=2;
        int end=50;

        for(int num=start;num<=end;num++){

            boolean isPrime=true;
            if(num<2){
                isPrime=false;
            }else {
                for(int i=2; i*i<=num;i++){
                     if(num % i ==0){
                         isPrime=false;
                         break;
                     }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
