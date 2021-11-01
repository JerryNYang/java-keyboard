import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter first name: ");

    String firstName = keyboard.nextLine();  // Read user input
    System.out.println("First name is: " + firstName);  // Output user input
    System.out.println();
    System.out.println("Reading...Writing");
    System.out.println( " thru the monitor ... keyboard");
    
  }
}
