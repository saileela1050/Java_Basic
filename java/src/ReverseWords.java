// reverse words in the given string


public class ReverseWords {

    public static void main(String[] args){

        String str="java is easyy";
        String words[]=str.split("\\s+");

        for(int i= words.length-1;i>=0;i--){
            System.out.println(words[i]+"");
        }
    }
}
