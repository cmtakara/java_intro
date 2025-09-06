// imports
import java.util.Scanner;

// main
public class App {
    public static void main(String[] args) throws Exception {
        // create a way to receive keyboard inputs
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input three integers");

        // get the inputs and save them into variables to be able to access later
        int first = keyboard.nextInt();
        int second = keyboard.nextInt();
        int third = keyboard.nextInt();

        // calculate a solution using inputs, and display to user
        System.out.println("The product of all three is: " + first*second*third);
        // close Scanner to clean up resources
        keyboard.close();

        // if i want to do anything more complex, this will get messy.  
        // methods are discussed later, with classes, but I can to use helper methods to contain the work.
        helper();
    }

    public static void helper() {
        System.out.println("This will do one set of defined functionality.");
    }
}
