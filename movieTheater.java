/*Dean Barlanti 11/19/2025*/

import java.util.Scanner;


public class movieTheater {
	public static int[] determinePrices(int[] ages) {
		int[] prices = new int[ages.length];
		
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] <= 13) {
				prices[i] = 8;
			}
			else if(ages[i] <= 64) {
				prices[i] = 12;
			}
			else if(ages[i] > 65) {
				prices[i] = 10;
			}
		}
		return prices;
		
	}


	public static void printDailyRevenue(int[] revenues) {
		int totalRevenue = 0;
		
		System.out.println("Revenue per ticket: ");
		for( int i = 0; i < revenues.length; i++) {
			System.out.println("Ticket " + (i + 1) + " $" + revenues[i]);
			totalRevenue += revenues[i];
		}
		
		System.out.println("Total daily revenue: $ " + totalRevenue);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] customerAges = new int[8];
		
        System.out.println("Enter the ages of 8 customers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Customer " + (i + 1) + ": ");
            customerAges[i] = scanner.nextInt();
        }

        int[] ticketPrices = determinePrices(customerAges);

        printDailyRevenue(ticketPrices);

        scanner.close();
	}

}
