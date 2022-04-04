import java.io.FileWriter;    // Import the FileWriter class
import java.io.File;         // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException {
  
    try {
        // Create FileWriter & Scanner 

        File file = new File("expenses.txt");
        FileWriter fr = new FileWriter(file, true); // parameter 'true' is for append mode
        
        Scanner fileScan = new Scanner(new File("expenses.txt"));
        Scanner scan = new Scanner(System.in); 
     
        // Strings and Objects 

        String name;
        String product;
        
        double amount;
        
        boolean proceed = true;

        // while loop to get user's info as long they provide y

        while (proceed) {
            System.out.println("Input your name: ");
            name = scan.nextLine();

            System.out.println("What did you purchase: ");
            product = scan.nextLine();
            
            System.out.println("How much did you pay? (in USD)");
            amount = scan.nextDouble();

            fr.write(name + " purchased " + product + " for " + amount + " US dollars \n" );

            System.out.println("Would you like to log another purchase? (y/n)");
            scan.nextLine();
            proceed = scan.nextLine().trim().toLowerCase().equals("y"); 
        }

        // Close FileWriter class (before the next if loop to avoid getting an empty file when using the Scanner objects)
        fr.close();

        if(proceed == false) {

            System.out.println("Would you like to read a summary of your purchases?");          
            String y = scan.nextLine();

            if(y.trim().toLowerCase().equals("y")) {

                    while (fileScan.hasNext()) {
                    System.out.println(fileScan.nextLine());
                }
            }
            System.out.println("Get off of ZoodMall! \n");
        }


        // Close Scanner objects
        scan.close();
        fileScan.close();
        
        // If you have already have a expenses.txt file, you need to delete it
        // before you compile your code again

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
    

