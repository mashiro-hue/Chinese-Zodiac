package chineseZodiac;

import java.time.LocalDate;

public interface ZodiacBuilder {
    ZodiacInfo buildZodiacSign(LocalDate birthdate);

    String calculateLuckyNumber(LocalDate birthdate);

    String calculateLuckyColor(LocalDate birthdate);

    String calculateLuckyAnimal(LocalDate birthdate);

    String calculatePredictions(LocalDate birthdate);
}
