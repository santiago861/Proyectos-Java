import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    public double suma(double n, double s) {
        return n + s;
    }
    public double rest(double n, double s) {
        return n - s;
    }
    public double mul(double n, double s) {
        return n * s;
    }
    public double div(double n, double s) {
        if (s == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return n / s;
    }
    public double pot(double n, double s) {
        return Math.pow(n, s);
    }

    public static void main(String[] args) {
        Calculator demo = new Calculator();
        Scanner sc = new Scanner(System.in);

        boolean flag = false;


        while (!flag) {
            System.out.println("Enter the operation you want to perform");
            System.out.println("1. Sum");
            System.out.println("2. Rest");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Pow");
            int enter = sc.nextInt();

            if(enter < 1 || enter > 5) {
                System.out.println("Invalid operation, please try again");
                continue;
            }
            System.out.println("Enter the first number you want to operate");
            double first = sc.nextInt();
            System.out.println("Enter the second number you want to operate with");
            double second = sc.nextInt();

            switch (enter) {
                case 1:
                    System.out.println("Result: " + demo.suma(first, second));
                    break;
                case 2:
                    System.out.println("Result: " + demo.rest(first, second));
                    break;
                case 3:
                    System.out.println("Result: " + demo.mul(first, second));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + demo.div(first, second));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Result: " + demo.pot(first, second));
                    break;
            }
            System.out.println("do you want to perform another operation? (yes/no)");
            String answer = sc.next();
            if(!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        sc.close();
    }
}