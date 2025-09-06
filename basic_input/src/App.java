// IMPORTS
//  import Scanner to be able to use the functionality to read in from the user inputs.
import java.util.Scanner;

// main function
//  in this case, everything is done in main. For now, just use the format of class and main definition
//      further explanation will be added later
public class App {
    public static void main(String[] args) throws Exception {
        // instantiate a new Scanner called keyboard.  Because we want the user to type, use System.in
        //  you need to create a Scanner instance to be able to use the methods in the Scanner class.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("input a word to define, then type the definition of that word");
        // both next() and nextLine() are Scanner methods - what is the difference?
        //  they both accept the new input as a string.  However, next() looks for a delimiter - usually white space
        //      you can define the delimter using useDelimter() - the following line would be prior to next() and would then use - as the stopping point
        //      keyboard.useDelimiter("-");
        //      nextLine() reads in until it reaches a line ending character.
        String newWord = keyboard.next();
        String wordDefined = keyboard.nextLine();
        // printf is used to format the output.
        //  in this case, it is being used to output two variable strings within a string literal.
        //  but another common use is to output decimals to a specific value.
        System.out.printf("%s HAS THE DEFINITION %s%n", newWord, wordDefined);
        // close the scanner
        //  this is important because it releases the system resources related to that Scanner
        keyboard.close();


        // demonstrate print versus println for printing strings
        //      these will both be on the same line
        System.out.print("Hello");
        System.out.print("and Good Bye");
        //      this is a new line character
        System.out.print('\n');
        //      these will all print on different lines
        System.out.println('1');
        System.out.println('2');

    }
}