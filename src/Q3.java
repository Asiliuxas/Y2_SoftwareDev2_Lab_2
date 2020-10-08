import javax.lang.model.type.NullType;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
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
        String word1 = sc.next();
        System.out.print("Please enter the second word: ");
        String word2 = sc.next();
        int width = word1.length(), height=word2.length();
        char[][] output = new char [width][height];
        char letter = Character.MIN_VALUE;
        for(int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                if (word1.toLowerCase().charAt(i) == word2.toLowerCase().charAt(j)){
                    letter = word1.toLowerCase().charAt(i);
                    i = width;
                    j = height;
                }
            }
        }
        if (letter != Character.MIN_VALUE){
            int posX=findIndex(word1.toLowerCase().toCharArray(),letter);
            int posY=findIndex(word2.toLowerCase().toCharArray(),letter);
            for(int x = 0; x < width; x++){
                for(int y = 0; y < height; y++){
                    if(posX == x){
                        output[x][y] = word2.charAt(y);
                    }
                    else if(posY == y){
                        output[x][y] = word1.charAt(x);
                    }
                    else{
                        output[x][y] = ' ';
                    }
                }
            }
            for (int i = 0; i < width; i++){
                for (int j = 0; j < height; j++){
                    System.out.print(output[i][j]);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No matching letter was found.");
        }
    }
}
