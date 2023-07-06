import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> count = new HashMap<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Update the count in the map
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        char mostCommonChar = ' ';
        int maxCount = 0;

        // Find the character with the highest count
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommonChar;
    }
}
