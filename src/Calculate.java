public class Calculate {
    public double calculateArea(double side)
    {
        return side * side;
    }
    public double calculateArea(double length, double width)
    {
        return length * width;
    }
    public double calculateArea(double radius,boolean isCircle)
    {
         return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        double squareArea=cal.calculateArea(5.0);
        double rectangleArea=cal.calculateArea(4.0,7.0);
        double circleArea=cal.calculateArea(6.0,true);
        System.out.println("Area of Square" +squareArea);
        System.out.println("Area of Rectangle" +rectangleArea);
        System.out.println("Area of Circle "+ circleArea);



    }
}
