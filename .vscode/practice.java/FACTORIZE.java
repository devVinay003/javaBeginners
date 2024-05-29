public class FACTORIZE{
   
    public static final double PI = 3.14159;

 
    public static double calculateCircleArea(final double radius) {
       
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateCircleArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}