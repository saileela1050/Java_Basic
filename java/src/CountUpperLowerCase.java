//  count uppercase and lowercase letters in the given string

public class CountUpperLowerCase {

    public static void main(String[] args){

        String str="software ENGINNEERS";

        int upper=0;
        int lower=0;

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }

        }
        System.out.println("Upper:" +upper);
        System.out.println("Lower:" +lower);
    }
}
