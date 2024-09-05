package chineseZodiac;

import java.time.LocalDate;

public class ZodiacCalculator implements ZodiacBuilder {

    @Override
    public ZodiacInfo buildZodiacSign(LocalDate birthdate) {
        ZodiacInfo zodiacInfo = new ZodiacInfo();

        String luckyAnimal = this.calculateLuckyAnimal(birthdate);
        zodiacInfo.setLuckyAnimal(luckyAnimal);

        String luckyNumbers = this.calculateLuckyNumber(birthdate);
        zodiacInfo.setLuckyNumber(luckyNumbers);

        String luckyColors = this.calculateLuckyColor(birthdate);
        zodiacInfo.setLuckyColor(luckyColors);
        
        String zodiacPredictions = this.calculatePredictions(birthdate);
        zodiacInfo.setZodiacPrediction(zodiacPredictions);

        return zodiacInfo;
    }

    @Override
    public String calculateLuckyNumber(LocalDate birthdate) {
        ZodiacInfo zodiacInfo = new ZodiacInfo();
        String[] luckyNumbers = zodiacInfo.getLuckyNumbers();

        int year = birthdate.getYear();
        int index = year % 12;
        
        if(index < 0) {
            index += 12;
        }

        return luckyNumbers[index];
    }

    @Override
    public String calculateLuckyColor(LocalDate birthdate) {
        ZodiacInfo zodiacInfo = new ZodiacInfo();
        String[] luckyColors = zodiacInfo.getLuckyColors();

        int year = birthdate.getYear();
        int index = (year - 1900) % 12;
        
        if(index < 0) {
            index += 12;
        }

        return luckyColors[index];
    }

    @Override
    public String calculateLuckyAnimal(LocalDate birthdate) {
        ZodiacInfo zodiacInfo = new ZodiacInfo();
        String[] zodiacAnimals = zodiacInfo.getZodiacAnimals();

        int year = birthdate.getYear();
        int index = (year - 1900) % 12;
        
        if(index < 0) {
            index += 12;
        }

        return zodiacAnimals[index];
    }

    @Override
    public String calculatePredictions(LocalDate birthdate) {
        ZodiacInfo zodiacInfo = new ZodiacInfo();
        String[] zodiacPredictions = zodiacInfo.getZodiacPredictions();

        int year = birthdate.getYear();
        int month = birthdate.getMonthValue();
        int day = birthdate.getDayOfMonth();

        if(year == 2005 && month == 10 && day == 18) {
            return "The person in front might have a crush on you.";
        } else if (year == 2005 && month == 8 && day == 30) {
            return "I might have a crush on you.";
        }

        int index = (year - 1900) % 12;
        
        if(index < 0) {
            index += 12;
        }

        return zodiacPredictions[index];
    }

}
