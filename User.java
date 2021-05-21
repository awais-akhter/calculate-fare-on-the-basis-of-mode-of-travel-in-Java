import java.util.Scanner;

public class User {

	
	String name;
	private String source;
	private String destination;
	String mode;
	int fare;
	
	private String travelClass;
	
	Scanner input = new Scanner(System.in);
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	
	public void mode() {
		System.out.println("Enter Mode of Travel: \n1. By Bus\n2. By Train\n3. By Air");
		int choice = input.nextInt();
		if (choice == 1) {
			mode = "Bus";
		} else if (choice == 2) {
			mode = "Train";
		} else if (choice == 3) {
			mode = "Air";
		}
		
	}
	public void details() {
		System.out.println("Enter your Name: ");
		name = input.nextLine();
		System.out.println("Enter Departure: ");
		setSource(input.nextLine());
		System.out.println("Enter Destination: ");
		setDestination(input.nextLine());
		

		
	}
	
	
	
}
