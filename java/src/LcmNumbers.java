public class LcmNumbers {

    public static void main(String[] args){

        int a=12;
        int b=18;

        int num1=a;
        int num2=b;

        while(b!=0){
           int  reminder= a % b;
           a=b;
           b=reminder;
        }
        int gcd=a;
        int lcm=(num1/gcd) * num2;
        System.out.println("lcm of two numbers:" +lcm);
    }
}
