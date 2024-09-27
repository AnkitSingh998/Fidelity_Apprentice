import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String reversed = "";
        for(int i=words.length-1; i>=0; i--) {
            reversed += words[i]+" ";
        }
        System.out.println(reversed);
    }



}
