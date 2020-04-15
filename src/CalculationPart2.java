import java.util.Scanner;

public class CalculationPart2 {
    public static void main (String[]args ){

        Scanner input = new Scanner(System.in);
        String message1 = "Coding is ";
        System.out.println(" ");
        System.out.println("Enter a message1");

        message1 = input.nextLine();

        String message2 = "fun";
        System.out.println("Enter a message2");
        message2 = input.nextLine();
        System.out.println(" ");
        String message = message1 + "" + message2;
        System.out.println(message);

    }
    }
