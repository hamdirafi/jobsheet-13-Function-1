import java.util.Scanner;

public class ExpressingGratitude_244107060159 {

public static String getGreetingRecipient() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the recipient's name: ");
    return scanner.nextLine();
}


public static void sayThankyou() {
    String recipient = getGreetingRecipient();
    System.out.println("Thank you, " + recipient + ", for your support!");
}

public static void main(String[] args) {
    sayThankyou();
}
}