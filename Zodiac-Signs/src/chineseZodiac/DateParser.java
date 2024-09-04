package chineseZodiac;

import java.time.LocalDate;

public class DateParser {
    private int year; 
    private int month;
    private int day;

    public DateParser(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public LocalDate getLocalDate() {
       LocalDate localDate = LocalDate.of(year, month, day);
       return localDate;
    }
}
