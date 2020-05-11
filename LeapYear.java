import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeapYear {

	private static Scanner in;
	private static List<Integer> sucessInputs = new ArrayList<Integer>();
	private static List<Integer> failedInputs = new ArrayList<Integer>();

	public static void main(String[] args) {

		System.out.println("-----Array input started----");
		Integer[] testInputs = { 1700, 1800, 2000, 2008, 2012, 2016, 2017, 2018, 2019, 2100 };
		Arrays.asList(testInputs).forEach(input -> {
			leapYearCalculation(input);
		});
		System.out.println("-----Array input result----");
		System.out.println("----Leap Year----");
		sucessInputs.forEach(System.out::println);
		System.out.println("--------");
		
		System.out.println("----Not leap Year----");
		failedInputs.forEach(System.out::println);
		System.out.println("--------");
		
		
		System.out.println("-----Array input finished----");
		// used for add manual Year
		in = new Scanner(System.in);
		System.out.println("-----Manual input started----");
		System.out.print("Enter Year Manually: ");
		int manualYear = in.nextInt();
		leapYearCalculation(manualYear);
		System.out.println("-----Manual input finish----");

	}

	private static void leapYearCalculation(Integer year) {
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}

			} else {
				leap = true;
			}

		} else {
			leap = false;
		}

		if (leap) {
			sucessInputs.add(year);
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
			failedInputs.add(year);
		}
	}

}
