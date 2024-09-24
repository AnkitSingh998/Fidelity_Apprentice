public class Question2 {
    public static double calculate(int pizza,int puff, int pepsi)
    {
        System.out.println("Pizza bill is" + pizza*200);
        System.out.println("Pepsi bill is" + pepsi*120);
        System.out.println("Puff bill is" + puff*40);
        int sum=(pizza*200)+(puff*40)+(pepsi*120);
        return sum;

    }
    public static void main(String[] args) {
      System.out.println(calculate(5,6,2));
    }
}
