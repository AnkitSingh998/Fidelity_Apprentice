import java.util.Scanner;

public class game2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the game : ");
        String name = sc.next();
        System.out.println("Enter the number of players : ");
        int players = sc.nextInt();
        System.out.println("Enter the time limit of sport ");
        int timeLimit = sc.nextInt();
        GameWithTimeLimit  g=new GameWithTimeLimit(name,players,timeLimit);
        g.display();



    }
}
