import java.util.Scanner;

public class ByTrain extends User {

	int fare;

	Scanner input = new Scanner (System.in);
	
	public int calculateFare() {
		System.out.println("Enter the Class (1. Upper / 2. Lower): ");
		int choice = input.nextInt();
		
		if (choice == 1 ) {
			super.setTravelClass("Upper");
			fare = 10000;
		} else if (choice == 2){
			super.setTravelClass("Lower");
			fare = 7000;
		}
		
		return fare;
		
	}
	
	
	
}
