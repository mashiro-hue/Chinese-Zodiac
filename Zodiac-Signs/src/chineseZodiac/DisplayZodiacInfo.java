package chineseZodiac;

import java.time.LocalDate;

public class DisplayZodiacInfo {
    private ZodiacInfo zodiacInfo;

    public DisplayZodiacInfo(int year, int month, int day) {
        DateParser parse = new DateParser(year, month, day);
        ZodiacBuilder builder = new ZodiacCalculator();

        LocalDate parsedBirthday = parse.getLocalDate();

        this.zodiacInfo = builder.buildZodiacSign(parsedBirthday);
    }   

    public void displayLuckyNumber() {
        System.out.println("Lucky Number: " + zodiacInfo.getLuckyNumber());
    }

    public void displayLuckyColor() {
        System.out.println("Lucky Color: " + zodiacInfo.getLuckyColor());
    }

    public void displayZodiacAnimal() {
        System.out.println("Chinese Zodiac Animal: " + zodiacInfo.getZodiacAnimal());
    }

    public void displayZodiacPrediction() {
        System.out.println("Prediction: " + zodiacInfo.getZodiacPrediction());
    }
}
