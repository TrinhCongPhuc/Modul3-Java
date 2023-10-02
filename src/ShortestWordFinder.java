package BT_SS10;

import java.util.Arrays;
import java.util.List;

public class ShortestWordFinder {
    public static void main(String[] args) {
        String inputString = "This is a different input string with several words of varying lengths";

        List<String> wordList = Arrays.asList(inputString.split(" "));

        System.out.println("Danh sách các từ: " + wordList);

        String shortestWord = findShortestWord(wordList);

        System.out.println("Từ ngắn nhất: " + shortestWord);
    }

    public static String findShortestWord(List<String> words) {
        String shortest = words.get(0);
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }
}
