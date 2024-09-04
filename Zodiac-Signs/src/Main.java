import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import chineseZodiac.ChineseZodiac;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        ChineseZodiac chineseZodiac;
        int year, month, day, years, days;

        System.out.println("Please Enter your Birth Year: ");
        if((year = sc.nextInt()) > (years = LocalDate.now().getYear())) {
            sc.close();
            throw new DateTimeException("Your birth year must not exceed current year: " + years + "!");
        }

        System.out.println("Please Enter your Birth Month: ");
        if((month = sc.nextInt()) > 12) {
            sc.close();
            throw new DateTimeException("Your birth month must not exceed 12 months!");
        }

        System.out.println("Please Enter your Birth Day");
        if((day = sc.nextInt()) > (days = LocalDate.of(year, month, 1).lengthOfMonth())){
            sc.close();
            throw new DateTimeException("Your birth date must not exceed " + days + " days!");
        }

        chineseZodiac = new ChineseZodiac(year, month, day);

        chineseZodiac.run();

        sc.close();
    }
}
