// check one string rotation of another rotationn


public class OneStringRotationAnother {

    public static void main(String[] args){


        String str1="abef";
        String str2="efab";

//        String str1 = "abcd";
//        String str2 = "cdab";

        if(str1.length()==str2.length() && (str1+str1).contains(str2)){
            System.out.println("Strings are rotations");
        }
         else{
         System.out.println("Strings are not rotations");
        }
    }
}
