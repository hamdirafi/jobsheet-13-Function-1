import java.util.Scanner;

public class Greetings_244107060159 { 
   
    public static String getGreetingRecipient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the recipient's name: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String recipient = getGreetingRecipient();
        System.out.println("Hello, " + recipient + "!");
    }
}
