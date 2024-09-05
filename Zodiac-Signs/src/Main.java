import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import chineseZodiac.ChineseZodiac;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChineseZodiac chineseZodiac;
        int year = 0, month = 0, day = 0;
        boolean run = true;

        while (run) {
            int years, days;

            try {
                System.out.println("Please Enter your Birth Year: ");
                year = sc.nextInt();
                years = LocalDate.now().getYear();
                if (year > years) {
                    throw new DateTimeException("Your birth year must not exceed the current year: " + years + "!");
                }

                System.out.println("Please Enter your Birth Month (1-12): ");
                month = sc.nextInt();
                if (month < 1 || month > 12) {
                    throw new DateTimeException("Your birth month must be between 1 and 12!");
                }

                System.out.println("Please Enter your Birth Day: ");
                days = LocalDate.of(year, month, 1).lengthOfMonth();
                day = sc.nextInt();
                if (day < 1 || day > days) {
                    throw new DateTimeException("Your birth day must be between 1 and " + days + " for the selected month!");
                }

                run = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
            } catch (DateTimeException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();

        if (year > 0 && month > 0 && day > 0) {
            chineseZodiac = new ChineseZodiac(year, month, day);
            chineseZodiac.run();
        }
    }
}
