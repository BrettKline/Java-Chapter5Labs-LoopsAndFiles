import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many floors does this hotel have? (Make it at least one.)");
		int numFloors = input.nextInt();
		System.out.println("Okay, so " + numFloors + " floor(s). We'll ask you how many rooms each floor has (Minimum: 10), then how many of those rooms are occupied (Minimum: 0).");
		boolean isBadData;
		int numRooms = 0, sumRooms = 0, numOccupied = 0, sumOccupied = 0;
		for (int c = 0; c < numFloors; c++) {
			isBadData = false;
			do {
				numRooms = input.nextInt();
				numOccupied = input.nextInt();
				//Check for bad data conditions
				if ((numOccupied > numRooms) || (numRooms < 10) || (numOccupied < 0)) {
					isBadData = true;
					System.out.println("Error: you entered values that make no sense. Try again. (Order: Number of rooms, then number of occupied rooms)");
				}
				else {
					sumRooms += numRooms;
					sumOccupied += numOccupied;
					System.out.println("Floor " + (c + 1) + "'s occupancy rate is %" + (((double)numOccupied / numRooms) * 100) + ".");
					
				}
			}
			while(isBadData);
		}
		System.out.printf("Looks like your whole hotel's occupancy rate is %.2f percent. There's %d rooms; %d are vacant, and %d of them are occupied.", ((double)sumOccupied / sumRooms) * 100, sumRooms, sumRooms - sumOccupied, sumOccupied); 
		input.close();

	}

}
