import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int service;
	
	AdvancedWeek advw = new AdvancedWeek();
	BasicWeek basw = new BasicWeek();
	
	do {
	System.out.println("Which service would you like to choose?");
	service = scan.nextInt();
	} while (service < 1 || service > 4);
	
	
	switch (service) {
	case 1:
		basw.printDays();
		break;
	case 2:
		advw.printDays();
		break;
	case 3:
		Calculator calc = new Calculator();
		break;
	default:
		System.out.println("Not passing!");
	}
	
    }
}