import java.util.Scanner;

public class Programme_13_Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);

        scanner.close();
    }

    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

}

