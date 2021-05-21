import java.util.Scanner;

public class ByAir extends User {

	int fare;

	Scanner input = new Scanner (System.in);
	
	public int calculateFare() {
		System.out.println("Enter the Class (1. Business / 2. Economy): ");
		int choice = input.nextInt();
		
		if (choice == 1 ) {
			super.setTravelClass("Business");
			fare = 150000;
		} else if (choice == 2){
			super.setTravelClass("Economy");
			fare = 50000;
		}
		
		return fare;
		
	}
	
	
	
	
	
	
	
	
}
