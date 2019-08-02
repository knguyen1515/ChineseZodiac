import java.util.*;

/**
 * The ChineseZodiac program tells you the Zodiac ZodiacSign corresponding to your birthdate. Includes information about
 * the sign.
 *
 * @author Kenny Nguyen, Michael Deely
 * @version 1.0
 * @since 2019-08-01
 */
public class ChineseZodiac {
    private int birthYear;
    List<ZodiacSign> allZodiacs;

    public ChineseZodiac() {
        this.birthYear = 0;
        this.allZodiacs = new ArrayList<ZodiacSign>();
        Collections.addAll(allZodiacs, new Rat(), new Ox(), new Tiger(), new Rabbit(), new Dragon(), new Snake(),
            new Horse(), new Goat(), new Monkey(), new Rooster(), new Dog(), new Pig());
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter your birth year (only years after 1912 and before 2043): ");
            birthYear = input.nextInt();
        } while (birthYear < 1912 || birthYear > 2043);
        findZodiac(birthYear);
    }

    // n^2 running time. Could be made more efficient. Don't like using break.
    public void findZodiac(int birthYear) {
        for (ZodiacSign zodiacSign: allZodiacs) {
            for (int year: zodiacSign.years) {
                if (year == birthYear) {
                    outputZodiacInfo(zodiacSign);
                    break;
                }
            }
        }
    }

    public void outputZodiacInfo(ZodiacSign zodiac) {
        System.out.println("\nCongratulations! You are a " + zodiac + ".");
        System.out.print("\t• Years of the " + zodiac + ": " + zodiac.years[0]);
        for (int i = 1; i < zodiac.years.length; i++)
            System.out.print(", " + zodiac.years[i]);
        System.out.println("\n\t• Personality: " + zodiac.personality
                + "\n\t• Lucky flowers: " + zodiac.luckyFlowers
                + "\n\t• Lucky numbers: " + zodiac.luckyNumbers
                + "\n\t• Lucky colors: " + zodiac.luckyColors
                + "\n\t• Unlucky numbers: " + zodiac.unluckyNumbers
                + "\n\t• Unlucky colors: " + zodiac.unluckyColors);
    }

    public static void main(String[] args) {
        ChineseZodiac program = new ChineseZodiac();
        System.out.println("Welcome! With this program you can discover your Chinese zodiac sign!");
        program.input();
    }
}
