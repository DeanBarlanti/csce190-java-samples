import java.util.Scanner;


public class Zodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your birthday as numbers, month then day");
		int month = input.nextInt();
		int day = input.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("Invalid Month! ");
			return;
		}
		
		int maxDay = 31;
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			maxDay = 30;
		}
		else if(month ==2) {
			maxDay = 29;
		}
		
		if(day < 1 || day > maxDay) {
			System.out.println("Invalid Day");
		}
		
		String zodiac = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiac = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiac = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiac = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiac = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiac = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiac = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiac = "Pisces";
        }
		
        System.out.println("You are a " + zodiac + "!" );
	}
	
	

}