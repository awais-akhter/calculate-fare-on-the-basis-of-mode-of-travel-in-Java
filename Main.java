import java.time.LocalDate;
import java.time.LocalTime;
public class Main {

	public static void main(String[] args) {
		
		User parent = new User();
		ByAir air = new ByAir();
		ByTrain train = new ByTrain();
		ByBus bus = new ByBus();
		
		parent.mode();
		
		if (parent.mode.equals("Air")) {
			air.details();
			air.calculateFare();
			
			System.out.println("-----------------------------------------------");
			System.out.println("------ TURKISH AIRLINES ------\n\n");
			System.out.println("Traveler Name: " + air.name);
			System.out.println("Departure: " + air.getSource());
			System.out.println("Destination: " + air.getDestination());
			System.out.println("Date: " + LocalDate.now());
			System.out.println("Time: " + LocalTime.now());
			System.out.println("Mode of Travel: " + parent.mode);
			System.out.println("Travel Class: " + air.getTravelClass());
			
			System.out.println("\n\n-----------------------------------------------\n");
			System.out.println("Your Total Fare is: " +  air.fare);
			System.out.println("\n\n WARINING: You are crossing Border illegally");
			
			
		} else if (parent.mode.equals("Train")) {
			train.details();
			train.calculateFare();
			
			System.out.println("-----------------------------------------------");
			System.out.println("------ PEACE EXPRESS ------\n\n");
			System.out.println("Traveler Name: " + train.name);
			System.out.println("Departure: " + train.getSource());
			System.out.println("Destination: " + train.getDestination());
			System.out.println("Date: " + LocalDate.now());
			System.out.println("Time: " + LocalTime.now());
			System.out.println("Mode of Travel: " + parent.mode);
			System.out.println("Travel Class: " + train.getTravelClass());
			
			System.out.println("\n\n-----------------------------------------------\n");
			System.out.println("Your Total Fare is: " +  train.fare);
			System.out.println("\n\n WARINING: You are crossing Border illegally.");
		}else if (parent.mode.equals("Bus")) {
			bus.details();
			bus.calculateFare();
			System.out.println("-----------------------------------------------");
			System.out.println("------ MAGIX MOVERS ------\n\n");
			System.out.println("Traveler Name: " + bus.name);
			System.out.println("Departure: " + bus.getSource());
			System.out.println("Destination: " + bus.getDestination());
			System.out.println("Date: " + LocalDate.now());
			System.out.println("Time: " + LocalTime.now());
			System.out.println("Mode of Travel: " + parent.mode);
			System.out.println("Travel Class: " + bus.getTravelClass());
			
			System.out.println("\n\n-----------------------------------------------\n");
			System.out.println("Your Total Fare is: " +  bus.fare);
			System.out.println("\n\n WARINING: You are crossing Border illegally.");
		}

		
		
		
		
	}

}
