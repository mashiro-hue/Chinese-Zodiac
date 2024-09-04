package chineseZodiac;

public class ZodiacInfo {
    private String luckyNumber;
    private String luckyColor;
    private String zodiacAnimal;
    private String zodiacPrediction;

    private final String[] zodiacAnimals = {
            "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat",
            "Monkey", "Rooster", "Dog", "Pig"
    };

    private final String[] luckyNumbers = {
            "3, 7, 9", // Rat
            "1, 4, 10", // Ox
            "2, 5, 8", // Tiger
            "3, 6, 9", // Rabbit
            "1, 6, 7", // Dragon
            "2, 8, 9", // Snake
            "3, 7, 11", // Horse
            "4, 8, 12", // Goat
            "5, 9, 11", // Monkey
            "1, 5, 6", // Rooster
            "3, 7, 9", // Dog
            "2, 5, 8" // Pig
    };

    private final String[] luckyColors = {
            "Blue", // Rat
            "Green", // Ox
            "Red", // Tiger
            "Pink", // Rabbit
            "Gold", // Dragon
            "Black", // Snake
            "Yellow", // Horse
            "Purple", // Goat
            "White", // Monkey
            "Orange", // Rooster
            "Brown", // Dog
            "Silver" // Pig
    };

    private final String[]  zodiacPredictions = {
            "This year, focus on building strong connections. Your social circle will play a key role in achieving your goals.", // Rat
            "A year of hard work and determination. Stay persistent, and your efforts will be rewarded.", // Ox
            "Adventure awaits! Embrace new opportunities with courage, and you’ll find success.", // Tiger
            "This is a year of tranquility. Prioritize your mental well-being and practice self-care.", // Rabbit
            "Your charisma will open doors for you. Take charge and lead with confidence.", // Dragon
            "Wisdom and patience will be your allies this year. Trust your intuition in decision-making.", // Snake
            "Energy and enthusiasm will drive you forward. Stay active and explore new hobbies.", // Horse
            "Creativity will flourish. This is a great time to start new projects and express yourself.", // Goat
            "A year of quick thinking and adaptability. Stay flexible, and you’ll navigate any challenges with ease.", // Monkey
            "Attention to detail will be crucial. Stay organized and plan carefully to achieve your ambitions.", // Rooster
            "Loyalty and honesty will strengthen your relationships. Trust in your close ones for support.", // Dog
            "A year of abundance and prosperity. Focus on gratitude, and good fortune will follow." // Pig
    };

    public void setLuckyNumber(String luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public void setLuckyColor(String luckyColor) {
        this.luckyColor = luckyColor;
    }

    public void setLuckyAnimal(String zodiacAnimal) {
        this.zodiacAnimal = zodiacAnimal;
    }

    public void setZodiacPrediction(String zodiacPrediction) {
        this.zodiacPrediction = zodiacPrediction;
    }

    public String getLuckyNumber() {
        return this.luckyNumber;
    }

    public String getLuckyColor() {
        return this.luckyColor;
    }

    public String getZodiacAnimal() {
        return this.zodiacAnimal;
    }

    public String getZodiacPrediction() {
        return this.zodiacPrediction;
    }

    public String[] getZodiacAnimals() {
        return zodiacAnimals;
    }

    public String[] getZodiacPredictions() {
        return zodiacPredictions;
    }

    public String[] getLuckyNumbers() {
        return luckyNumbers;
    }

    public String[] getLuckyColors() {
        return luckyColors;
    }

}
