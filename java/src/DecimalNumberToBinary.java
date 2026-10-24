
// convert binary number to decimal
public class DecimalNumberToBinary {

    public static void main(String[] args){

        int num=10;
        int original=num;
        String binary="";

        while(num>0){
            int reminder=num %2;
            binary=reminder +  binary;
            num=num/2;

        }
        System.out.println("Binary of " +original+":" +binary);
    }
}
