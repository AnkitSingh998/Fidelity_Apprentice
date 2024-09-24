import java.util.Scanner;

public class Question6 {
    public static int evensum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }
        int sum=evensum(numbers);
        System.out.println("The sum is: "+sum);

    }
}
