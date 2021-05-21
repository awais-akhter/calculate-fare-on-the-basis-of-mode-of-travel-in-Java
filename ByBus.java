import java.util.Scanner;

public class ByBus extends User {
	int fare;

	Scanner input = new Scanner (System.in);
	
	public int calculateFare() {
		System.out.println("Enter the Class (1. AC / 2. Non-AC): ");
		int choice = input.nextInt();
		
		if (choice == 1 ) {
			super.setTravelClass("AC");
			fare = 4500;
		} else if (choice == 2){
			super.setTravelClass("Non-AC");
			fare = 2000;
		}
		
		return fare;
		
	}
}
