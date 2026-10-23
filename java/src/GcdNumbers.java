
// gcd of two numbers


public class GcdNumbers {


    public static void main(String[] args) {

        int a=12;
        int b=18;

        while(b!=0){
            int reminder=a %b;
            a=b;
           b= reminder;
        }
        System.out.println("GCD:" +a);
    }
    }
