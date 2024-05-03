import java.util.Scanner;

public class Programme_19_ConvertString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
      Programme_19_ConvertString t = new Programme_19_ConvertString();
        t.convertStringToLowerCase(uppercase);
        scanner.close();

    }

    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
