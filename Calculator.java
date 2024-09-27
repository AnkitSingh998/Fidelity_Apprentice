public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b, double[]remainder) {
        if(b==0){
            System.out.println("Divide by zero not possible");
            return 0;
        }
        remainder[0]=a%b;
        return (int) ((double) a/b);
    }
}
