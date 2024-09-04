Here’s a sample `README.md` for your Chinese Zodiac program:

```markdown
# Chinese Zodiac Calculator

This Java program calculates and displays Chinese Zodiac information based on the user's birthdate. It provides details such as the Zodiac animal, lucky numbers, lucky colors, and Zodiac predictions.

## Features

- **Determine Zodiac Animal**: Based on the year of birth.
- **Lucky Numbers**: Displayed according to the Zodiac sign.
- **Lucky Colors**: Displayed according to the Zodiac sign.
- **Zodiac Predictions**: Personalized predictions based on the Zodiac sign.

## Requirements

- Java Development Kit (JDK) 8 or higher
- IDE or text editor of your choice

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/mashiro-hue/Chinese-Zodiac.git
   ```

2. Navigate to the project directory:
   ```bash
   cd chinese-zodiac-calculator
   ```

3. Compile the Java files:
   ```bash
   javac -d bin src/chineseZodiac/*.java src/Main.java
   ```

4. Run the main program:
   ```bash
   java -cp bin Main
   ```

## Usage

1. When prompted, enter your birth year.
2. Enter your birth month.
3. Enter your birth day.

The program will display:
- Your Zodiac animal
- Your lucky numbers
- Your lucky color
- A prediction based on your Zodiac sign

## Example

```
Please Enter your Birth Year: 
1995
Please Enter your Birth Month: 
2
Please Enter your Birth Day: 
15
```

Output:
```
Zodiac Animal: Pig
Lucky Numbers: 2, 5, 8
Lucky Color: Silver
Prediction: A year of abundance and prosperity. Focus on gratitude, and good fortune will follow.
```

## Code Structure

- **`Main` Class**: Contains the main method to run the program. Handles user input and creates a `ChineseZodiac` object.
- **`ChineseZodiac` Class**: Initializes `DisplayZodiacInfo` and calls methods to display Zodiac information.
- **`ZodiacCalculator` Class**: Implements methods to calculate Zodiac information based on the birthdate.
- **`ZodiacInfo` Class**: Stores and provides Zodiac information such as animals, lucky numbers, colors, and predictions.
- **`DisplayZodiacInfo` Class**: Responsible for displaying the Zodiac information to the user.

## Error Handling

- **DateTimeException**: Raised for invalid dates or months.
- **InputMismatchException**: Raised for invalid input types.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
