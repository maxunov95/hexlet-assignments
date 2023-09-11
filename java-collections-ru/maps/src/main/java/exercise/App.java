package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println(toString(getWordCount("the java is the best programming language java")));
    }
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        for (String word
                :
                sentence.split(" ")) {
            if (!word.isEmpty()) {
                result.put(word, (result.containsKey(word) ? result.get(word) + 1 : 1));
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {

        if (map.isEmpty()) {
            return "{}";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (Map.Entry<String, Integer> entry
                :
                map.entrySet()) {
            stringBuilder.append("\n  ").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
//END
