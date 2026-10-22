//checking given string palidrome or not


public class PalindromeOrNot {

    public static void main(String[] args){

        String str="madam";
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("Palindrome");
        }
            else{
                System.out.println("Not palindrome");
            }
        }
    }

