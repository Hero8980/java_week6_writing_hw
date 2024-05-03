import java.util.Scanner;

public class Program_7_TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();
        Program_7_TempConversion t = new Program_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        scanner.close();
    }
    public void convertTempToDegreeCelsius(float temp){
        float c =( (temp-32) * 5 / 9);
        System.out.println("The temperature " + temp+ " Fahrenheit is equal to " + c + " degree celsius");

    }
}
