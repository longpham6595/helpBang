import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ 100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");

		int guest;
		System.out.print("Please specify the number of guests: ");
		guest = input.nextInt();
		int roomchoice;
		System.out.print("Please select your room choice (enter 1/2/3/4/5 corresponding to the options shown above): ");
		roomchoice = input.nextInt();
		int night;
		System.out.print("Please enter the number of nights: ");
		night = input.nextInt();
		int AAAmem;
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		AAAmem = input.nextInt();
		System.out.println("Are you a club member (enter 1 for yes, 0 for no)? ");
		int clubmem = input.nextInt();
		Random club = new Random();
		int a = club.nextInt(11);
		if (((clubmem == 1) && (a >= 4)) && (night < 8 && night == 4)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 1 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 8 && night < 12)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 2 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 12 && night < 16)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 3 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 16 && night < 20)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 4 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 20 && night < 24)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 5 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 24 && night < 28)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 6 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 28 && night < 32)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 7 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 32 && night < 36)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 8 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 36 && night < 40)) {
			System.out.println("Congratulations! You've qualified for our ''Stay" + night + "get 9 free promotion''");
			System.out.println("Discount will be applied during checkout depending on the number of days");
		}

		if ((clubmem == 1) && (a < 4)) {
			System.out.println("Unfortunately, you didn't qualify for our ''Stay 4 nights get 1 free promotion''.");
			System.out.println("Better luck next time!");
		}
		if (clubmem == 0) {
			System.out.println("");
		}
		if (roomchoice == 5) {
			System.out.println("");
			System.out.println("MEAL PACKAGES(PRICES SHOWN ARE PER GUEST PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.println("2. Deluxe @ $50 per guest");
			System.out.print("3. Indulgence @ $85 per guest");
			System.out.println("");
			System.out.print(
					"Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above)");
		} else {
			System.out.println("");
			System.out.println("MEAL PACKAGES(PRICES SHOWN ARE PER GUEST PER NIGHT)");
			System.out.println("0. Complementary @ $0 per guest");
			System.out.println("1. Standard @ $30 per guest");
			System.out.print("2. Deluxe @ $50 per guest");
			System.out.println("");
			System.out.print(
					"Please select your desired meal package (enter 0/1/2 corresponding to the options shown above)");
		}
		int mealpackage = input.nextInt();

		System.out.println("");
		System.out.println("CHECKOUT");
		double Roomcost = 0;
		if (roomchoice == 1) {
			Roomcost = (double) (50.50 * night);
		}

		if (roomchoice == 2) {
			Roomcost = (double) (75.00 * night);
		}

		if (roomchoice == 3) {
			Roomcost = (double) (100.75 * night);
		}

		if (roomchoice == 4) {
			Roomcost = (double) (150.25 * night);
		}

		if (roomchoice == 5) {
			Roomcost = (double) (225.50 * night);
		}
		System.out.println("Room Cost: \t \t \t $" + Roomcost);

		double mealcost = 0;
		if (mealpackage == 0) {
			System.out.print("");
		}

		if (mealpackage == 1) {
			mealcost = (double) (guest * night * 30.00);
			System.out.println("Meal Cost: \t \t \t +$" + mealcost);
		}

		if (mealpackage == 2) {
			mealcost = (double) (guest * night * 50.00);
			System.out.println("Meal Cost: \t \t \t +$" + mealcost);
		}

		if (mealpackage == 3) {
			mealcost = (double) (guest * night * 85);
			System.out.println("Meal Cost: \t \t \t +$" + mealcost);
		}
		double preliminarytotalcost = 0;
		preliminarytotalcost = (double) (Roomcost + mealcost);
		System.out.println("Preliminary Total Cost:  \t $" + preliminarytotalcost);
		double AAAdiscount = 0;
		if (AAAmem == 1) {
			AAAdiscount = (double) ((10 * preliminarytotalcost) / 100);
			System.out.println("AAA Discount: \t \t \t-$" + AAAdiscount);
		} else {
			System.out.print("");
		}

		double Clubmemberdiscount = 0;
		if (((clubmem == 1) && (a >= 4)) && (night < 8 && night == 4)) {
			Clubmemberdiscount = (double) (Roomcost * 1);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 8 && night < 12)) {
			Clubmemberdiscount = (double) (Roomcost * 2);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 12 && night < 16)) {
			Clubmemberdiscount = (double) (Roomcost * 3);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 16 && night < 20)) {
			Clubmemberdiscount = (double) (Roomcost * 4);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 20 && night < 24)) {
			Clubmemberdiscount = (double) (Roomcost * 5);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 24 && night < 28)) {
			Clubmemberdiscount = (double) (Roomcost * 6);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 28 && night < 32)) {
			Clubmemberdiscount = (double) (Roomcost * 7);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 32 && night < 36)) {
			Clubmemberdiscount = (double) (Roomcost * 8);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if (((clubmem == 1) && (a >= 4)) && (night == 36 && night < 40)) {
			Clubmemberdiscount = (double) (Roomcost * 9);
			System.out.println("Club Member Discount: \t \t \t  -$" + Clubmemberdiscount);
		}
		if ((a < 4) && (clubmem == 0) && (AAAmem == 0)) {
			System.out.println("No discounts Applied");
		}

		//Handle with club member situation
		

		double Totalcost = 0;
		Totalcost = (double) (preliminarytotalcost - (AAAdiscount + Clubmemberdiscount));
		System.out.println("Total Cost of Booking: \t \t $" + Totalcost);

	}
}