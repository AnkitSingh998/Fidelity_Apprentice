import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);
        int result;
        double quotient;
        double[]remainder=new double[1];
        switch (operator) {
            case '+':
                result = calc.add(first, second);
                System.out.println("Result of addition is "+result);
                break;
                case '-':
                    result = calc.subtract(first, second);
                    System.out.println("Result of subtraction is "+result);
                    break;
                    case '*':
                        result = calc.multiply(first, second);
                        System.out.println("Result of multiplication is "+result);
                        break;
                        case '/':
                            quotient=calc.divide(first,second,remainder);
                            if(second!=0) {
                                System.out.println("Result of division is " + quotient);
                                System.out.println("Results of remainder is " + remainder[0]);
                            }
                            break;
                            default:
                                System.out.println("Invalid operator");
        }
    }
}
