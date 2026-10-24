// Convert a Binary Number to Decimal

public class BinaryToDecimal {

    public static void main(String[] args){

        int binary=1010;
        int decimal=0;
        int base=1;

        while(binary>0){
            int digit=binary % 10;
            decimal=decimal + digit * base;
            base=base *2;
            binary=binary/10;
        }
        System.out.println("Decimal:" +decimal);
    }
}
