package chineseZodiac;

public class ChineseZodiac {
    public final DisplayZodiacInfo displayZodiacInfo;

    public ChineseZodiac(int year, int month, int day) {
        displayZodiacInfo = new DisplayZodiacInfo(year, month, day);
    }

    public void run() {
        displayZodiacInfo.displayZodiacAnimal();
        displayZodiacInfo.displayLuckyNumber();
        displayZodiacInfo.displayLuckyColor();
        displayZodiacInfo.displayZodiacPrediction();
    }
}
