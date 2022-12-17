/*
 * Purpose: 
 *          Write a java program that creates a console menu for user 
 *          to make some actions on files containing numbers
 * Input: user's choice, input file name
 * Output: file content, sum
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * COMP2202
 * Sec20
 * @author yessine
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {       

        Scanner input = new Scanner(System.in);
          
         // object reference to the selected file
         File selectedFile; // initialized to null, i.e., not yet created

        /*
         * Display the menu
        */
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter a file name");
        System.out.println("2 - Display file content");
        System.out.println("3 - Sum all numbers in file");
        System.out.println("4 - Quit");

        // keep looping until user choose 4 (quit)
        int choice; // contains the user's choice
        do {
            // prompt user an read his/her choice
            System.out.print("Your choice > ");
            choice = input.nextInt();

            // perform action related to user's choice
            switch (choice) {
                case 1:
                    // create an object file refering the selected file
                    System.out.print("Enter file name: ");
                    selectedFile = new File(input.next());
                    break;
                case 2:
                    // check that the file has been selected by the user
                    if (selectedFile != null) {
                        // create a scanner linked to the selected file                        
                        Scanner inFile = new Scanner(selectedFile);

                        // keep reading line per line until end-of-file
                        while (inFile.hasNextLine()) {
                            System.out.println(inFile.nextLine());
                        }
                    }
                    break;
                case 3:
                    int sum = 0; // variable that is used for summing numbers

                    if (selectedFile != null) {
                        // create a scanner linked to the selected file
                        Scanner inFile = new Scanner(selectedFile);

                        // keep reading interger by integer until end-of-file
                        while (inFile.hasNextInt()) {
                            sum += inFile.nextInt();
                        }
                    }
                    System.out.println("Sum: " + sum);
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

    }

}
