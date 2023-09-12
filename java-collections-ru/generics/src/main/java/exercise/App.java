package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> library, Map<String, String> filter) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book
                :
                library) {
            boolean isEqual = true;
            for (Map.Entry<String, String> entry
                    :
                    filter.entrySet()) {
                if (!book.get(entry.getKey()).equals(entry.getValue())) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
