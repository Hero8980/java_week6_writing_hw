import java.util.Scanner;

public class Programme_9_ConvertUpper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpper t = new Programme_9_ConvertUpper();
        t.convertUppercaseToLowerCase(uppercase);

        scanner.close();
    }
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}

