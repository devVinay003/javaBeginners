public class Calculator {
    // Method to add two numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        // Creating an object of Calculator class
        Calculator calculator = new Calculator();

        // Example usage of the methods
        double a = 12;
        double b = 54;

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.sub(a, b));
        System.out.println("Multiplication: " + calculator.mul(a, b));
        System.out.println("Division: " + calculator.div(a, b));
    }
}