// imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// main
public class App {
    public static void main(String[] args) throws Exception {
        // instantiate a new Scanner in order to use Scanner functionality
        // this one takes in "System.in" as the input - which takes the input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // in order to get user input on the keyboard, prompt the user to type the kind of input you want
        //      this isn't required for functionality but is for useability
        System.out.println("Enter your a word and a definition of the word");
        // read the input using the keyboard Scanner and save to variables 
        String newWord = keyboard.next();
        String wordDef = keyboard.nextLine();

        System.out.print(newWord + " - " + wordDef +'\n');

        // The above example assumes that the word to define is only a single word, with no spaces
        //  the next() method uses white space as a delimiter.  
        //  However, you can also set the delimiter to be any pattern
        //          this pattern has three optional parts:
        //              ,\\s*   is a comma followed by any amount of white space
        //              \\r     is a carriage return
        //              \\n     is a newline
        keyboard.useDelimiter(",\\s*|\\r|\\n");

        // prmpt the user
        System.out.println("Enter your name, favorite color, and age.  Separate each with a comma (,)");


        // define a variable of correct type to save the three inputs
        String name = keyboard.next();
        String color = keyboard.next();
        // for the age, we want it to be an integer, but next() reads in a string, so we cast the input to an int to get the correct data type
        int age = Integer.parseInt(keyboard.next());

        // output the variables to check correctness
        System.out.printf("You have entered the name: %s%n   the color: %s%n     the age: %d%n", name, color, age);

        // close the Scanner when it is no longer needed to free system resources
        keyboard.close();


        // differentiate between the two sets of outputs
        System.out.println("\n=================================================================\n");
        // Scanner can also be used to read from a file, rather than user input.
        // in this case, you need to define the file and understand what the file inputs looks like
        // read from a file
        File file = new File("data.txt"); // Assuming 'data.txt' is in the root directory of the project 
            // note the root directory of the project may not be where the App.java file is
        // try {} catch {} is used to catch the FileNotFoundException so that the program continues executing even if the file isn't there
        try {
            Scanner fileScan = new Scanner(file);
            System.out.println(fileScan.nextInt());
            System.out.println(fileScan.nextDouble());
            System.out.println(fileScan.nextBoolean());

            fileScan.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }


    }
}
