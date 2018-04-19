package maxOccurringUnbannedWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aditya.jagtiani on 4/18/18.
 */
public class MostCommonUnbannedWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[\\-\\+\\.\\^:,]", "").toLowerCase();
        String[] input = paragraph.split(" ");
        Map<String, Integer> counter = new HashMap<String, Integer>();
        List<String> bannedWords = Arrays.asList(banned);

        for (int i = 0; i < input.length; i++) {
            String cur = input[i];
            if (!bannedWords.contains(cur)) {
                maintainWordCount(counter, cur);
            }
        }

        String max = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

    private static void maintainWordCount(Map<String, Integer> map, String currentWord) {
        if (map.containsKey(currentWord)) {
            int count = map.get(currentWord);
            map.put(currentWord, count + 1);
        } else {
            map.put(currentWord, 1);
        }
    }
}
