import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char words[][] = new char [4][];
        char letter;
        boolean found = false;
        String entries[] = new String[words.length];
        System.out.println("Please enter "+words.length+" word(s).");
        for(int i=0;i<words.length;i++){
            entries[i] = sc.next();
            words[i] = entries[i].toLowerCase().toCharArray();
        }
        System.out.print("Please enter a letter to search for : ");
        letter = sc.next().toLowerCase().charAt(0);
        for(int i=0;i<words.length;i++){
            for(int j=0;j< words[i].length;j++){
                if(words[i][j] == letter){
                    found=true;
                    System.out.println("Letter '"+letter+"' was found at the index ["+j+"] in the word '"+entries[i]+"'");
                }
            }
        }
        if(!found){
            System.out.println("The letter '"+letter+"' was not found in any of the words.");
        }
    }
}
