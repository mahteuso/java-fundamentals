package count_letters;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'C', 'C', 'E', 'E', 'E', 'E'};
        System.out.println(countOccurrences(letters));
    }

    public static List<String> countOccurrences(char[] letters) {
        System.out.println("method countOccurrences was invoked");
        int count = 0;
        char letter = 'o';
        List<String> countLetter = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            if (i != 0) {
                if (letters[i] == letters[i - 1]) {
                    count++;
                    if (i == letters.length - 1) {
                        letter = letters[i - 1];
                        count++;
                        String Char = String.valueOf(letter);
                        String message = "char : %s => count : %s";
                        String countChar = String.format(message, Char, String.valueOf(count));
                        countLetter.add(countChar);
                    }
                } else {
                    letter = letters[i - 1];
                    count++;
                    String Char = String.valueOf(letter);
                    String message = "char : %s => count : %s";
                    String countChar = String.format(message, Char, String.valueOf(count));
                    countLetter.add(countChar);
                    count = 0;
                }
            }
        }
        return countLetter;
    }
}
