import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
public class LockedMeProject {

    //Setting the current path of the directory
    static String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
    static File fPath = new File(currentPath);
    public static void main(String args[]) throws IOException {

        System.out.println("LockerMe Project");
        System.out.println("Developer - Sneha Khanna");

        // Display current directory
        System.out.println("The current path is : " + currentPath);
        System.out.println();
        
        // User input
        Scanner scan = new Scanner(System.in);
        int whileCheck = 0;

        // Loop to displaying the recurring main menu 
        while (whileCheck == 0) {
            // Details to select the user operations  
            System.out.println("MAIN MENU");
            System.out.println("Enter the file names with appropriate file extensions");
            System.out.println("Select the operation you wish to perform: ");
            System.out.println("1. Retrieve the current files present in the system in ascending order wrt to their names");
            System.out.println("2. Return the Details as per the operation choosed");
            System.out.println("3. Close the Application");

            System.out.print("Enter your choice for main menu: ");
            int userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:
                    {
                        // Calling ascendingOrderFiles function from the class
                        ascendingOrderFiles();
                        break;
                    }

                case 2:
                    {
                        int whileSubCheck = 0;

                        // Loop to displaying the recurring sub menu menu 
                        while (whileSubCheck == 0) {
                        	System.out.println(); 
                            System.out.println("SUB MENU");
                            System.out.println("Enter the file name with appropriate file extensions");
                            System.out.println("1.  Add a file to the existing directory");
                            System.out.println("2.  Delete a file from the existing directory");
                            System.out.println("3.  Search a user specified file in the directory ");
                            System.out.println("4.  Back to main menu");
                            System.out.println("Enter your choice for File handling operations submenu:");

                            int submenuChoice = scan.nextInt();
                            switch (submenuChoice) {
                                case 1:
                                    {
                                        // Calling addFile function from the class
                                        addFile();
                                        break;
                                    }
                                case 2:
                                    {
                                        // Calling deleteFile function from the class
                                        deleteFile();
                                        break;
                                    }
                                case 3:
                                    {
                                        // Calling search function from the class
                                        search();
                                        break;
                                    }
                                case 4:
                                    {
                                        // When user wishes to exit the sub-menu 
                                        whileSubCheck = 1;
                                        break;
                                    }
                                default:
                                    {
                                        // Used in case if user enters an invalid input other then options specified
                                        System.out.println("Invalid Input");
                                    }
                            }
                        }
                        break;
                    }

                case 3:
                    {
                        System.out.println("Exiting the Application");
                        whileCheck = 1;
                        break;
                    }

                default:
                    {
                        // Used in case if user enters an invalid input other then options specified
                        System.out.println("Invalid Input");
                    }
            }
        }
    }

    public static void ascendingOrderFiles() {
    	
    	// Storing the files in list format
        List < String > listOfFiles = Arrays.asList(fPath.list());
        System.out.println("-----Retreiving files names in Ascending order-----");

        // Checks if there are files present in the current directory
        if (listOfFiles.isEmpty() == false) {
            // Sorts and displays the files if files exist
            System.out.println("List of files in unsorted order");
            System.out.println("Files present in this directory are:" + listOfFiles);

            // Sort function is used to by default sort the files in ascending order 
            Collections.sort(listOfFiles , String.CASE_INSENSITIVE_ORDER);

            System.out.println("List of files in ascending order");
            for (String s: listOfFiles) {
                System.out.println(s);
            }
            System.out.println();
        } 
        else {
            //Displays this message if no files found in the current directory
            System.out.println("Sorry there are no files present in the directory");
        }
    }
    

    public static void search() {

        System.out.println("-----Searching user specified file from the directory-----");
        System.out.println();
        boolean temporaryVariable = false;

        // Displaying files present in the current location
        List < String > listOfFiles = Arrays.asList(fPath.list());

        System.out.println("Files present in this directory are:" + listOfFiles);

        // User input for file to be searched
        System.out.println("Enter file to be searched: ");
        Scanner scan = new Scanner(System.in);
        String fileToBeDeleted = scan.nextLine();

        // Iterate to check if the user specified file is present in the directory
        for (String s1: listOfFiles) {
            if (temporaryVariable == false)
                temporaryVariable = fileToBeDeleted.equals(s1);
        }

        if (temporaryVariable == true) {
            System.out.println("File Exists");
            System.out.println();
        } 
        else {
            System.out.println("File Not Found");
            System.out.println();
        }
    }

    
    public static void addFile() throws IOException {

        System.out.println("-----Add user specified file to the directory-----");
        System.out.println();

        // Enter the file to be added
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired name of your file: ");
        String fileName = input.nextLine();

        // Converting to file
        File file = new File(fileName);

        // Creating new file in the directory
        if (file.createNewFile()) {
            System.out.println("File created.");
            System.out.println();
        } 
        else {
            System.out.println("File already exists.");
            System.out.println();
        }

        // Displaying the files after adding operation
        List < String > listOfFiles = Arrays.asList(fPath.list());
        System.out.println("Files present in this directory are:" + listOfFiles);
    }

    
    public static void deleteFile() throws IOException {

        boolean temporaryVariable = false;
        System.out.println("-----Delete user specified file to the directory-----");
        System.out.println();

        // Displaying files present in the current location
        List < String > listOfFiles = Arrays.asList(fPath.list());

        System.out.println("Files present in this directory are:" + listOfFiles);

        // User input for file to be deleted
        System.out.println("Enter file to be deleted: ");
        Scanner scan = new Scanner(System.in);
        String fileToBeDeleted = scan.nextLine();

        // Check if file exists 
        for (String s1: listOfFiles) {
            if (temporaryVariable == false)
                temporaryVariable = fileToBeDeleted.equals(s1);
        }
                
        // Checks if the files to be deleted exist
        if (temporaryVariable == true) {
            File file1 = new File(fileToBeDeleted);

            file1.delete();
            System.out.println("File deleted");
        } 
        else {
            System.out.println("File Not Found");
        }
    }
}