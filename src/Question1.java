import java.util.Scanner;

public class Question1 {
    public static double calculate(int[]numbers)
    {
        double sum=0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return  sum/numbers.length;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array ");
        int size=sc.nextInt();
        int[]numbers=new int[size];
        System.out.println("Enter numbers ");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        double avg=calculate(numbers);
        System.out.println("The average of the elements in array is "+avg);
    }
}
