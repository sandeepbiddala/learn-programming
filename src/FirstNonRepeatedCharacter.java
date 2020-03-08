import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string with repeated characters:");
        String str= in.nextLine();
        FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
        firstNonRepeatedCharacter.getFirstNonRepeatedCharacter(str);
    }

    public void getFirstNonRepeatedCharacter(String str){
         for(int i=0;i<str.length();i++){
             char character = str.charAt(i);
             for(int k=0;k<str.length();k++){
                 char nextChar = str.charAt(k);
                 if(i!=k && character == nextChar){
                     break;
                 } else{
                     if(k == str.length()-1) {
                         System.out.println("First Non repeated character:" + character);
                         return;
                     }

                 }

             }

        }

    }

}
