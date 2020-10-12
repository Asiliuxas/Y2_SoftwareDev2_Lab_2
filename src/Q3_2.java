import java.util.Arrays;
import java.util.Scanner;

public class Q3_2 {
    public static int findIndex(char[] entry, char search){
        int index = -1;
        for (int i=0;i<entry.length;i++){
            if(entry[i]==search) {
                index = i;
                i = entry.length;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first word: ");
        String w1 = sc.next();
        System.out.print("Please enter the second word: ");
        String w2 = sc.next();
        char letter = Character.MIN_VALUE;
        for (char i : w1.toLowerCase().toCharArray()){
            for (char j : w2.toLowerCase().toCharArray()){
                if (i==j){
                    letter = j;
                }
            }
        }
        if (letter!=Character.MIN_VALUE){
            char[][] output = new char[w1.length()][w2.length()];
            for (int i = 0; i < output.length; i++)
                Arrays.fill(output[i],' ');
            int px=findIndex(w1.toLowerCase().toCharArray(),letter);
            int py=findIndex(w2.toLowerCase().toCharArray(),letter);
            for (int i = 0; i<w1.length() ; i++)
                output[i][py] = w1.charAt(i);
            for (int i = 0; i<w2.length() ; i++)
                output[px][i] = w2.charAt(i);
            for (int i = 0; i < output.length; i++){
                for (int j = 0; j < output[i].length; j++){
                    System.out.print(output[i][j]);
                }
                System.out.println();
            }
        }
        else
            System.out.println("No matching letter was found.");

    }
}
