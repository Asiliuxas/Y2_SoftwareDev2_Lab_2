import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word[],letter;
        //boolean found =false;
        int index=-1;
        System.out.print("Please enter a word: ");
        String original_word = sc.next();
        word = original_word.toLowerCase().toCharArray();
        System.out.print("Enter a letter you would like to find: ");
        letter = sc.next().toLowerCase().toCharArray()[0];
        for (int i=0;i<word.length;i++){
            if(word[i]==letter) {
                index = i;
                i = word.length;
                //found=true;
                //System.out.print("\nLetter '" + letter + "' was in index [" + i + "] within word '"+original_word+"'");
            }
        }
        /*
        if(!found)
            System.out.println("'"+original_word+"' did not contain letter '"+letter+"'");
        else
            System.out.println("Letter '"+letter+"' was found at index ["+index+"]");
         */
        if(index==-1)
            System.out.println("Letter '"+letter+"' was not found.");
        else
            System.out.println("Letter '"+letter+"' was found at index ["+index+"]");
    }
}
