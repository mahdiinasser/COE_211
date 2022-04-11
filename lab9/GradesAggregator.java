import java.util.Scanner;
public class GradesAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize array of integers
            int[] assignment = new int[5];
            int attendance;
            int midterm;
            int overallAssingment = 0;

        // for loop to get user input & store in array
            for(int i = 0; i < assignment.length; i++) {
                System.out.println("Input the grade of assignment " + (i+1));
                assignment[i] = scan.nextInt();
            }

            System.out.println("Input the number of attended labs");
            attendance = scan.nextInt();

            System.out.println("Input the midterm grade");
            midterm = scan.nextInt();


        // for loop to iterate over the array & perform calculations
            for(int i=0; i < assignment.length; i++){
                overallAssingment += assignment[i];
            }

            overallAssingment /= 5;
            overallAssingment *= 0.3;

            attendance *= 100;
            attendance *= 0.05;
            attendance /= 7;

            midterm *= 0.3;

        // display output to user

        System.out.println("Assignments (30%): " + overallAssingment + "\nAttendance (5%): " + attendance + "\nMidterm (30%): " + midterm);

    }
}