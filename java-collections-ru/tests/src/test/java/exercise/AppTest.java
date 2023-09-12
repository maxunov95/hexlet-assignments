package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> actual1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(actual1, App.take(numbers1, 4));

        List<Integer> actual2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assertions.assertEquals(actual2, App.take(numbers1, 3));

        List<Integer> actual3 = new ArrayList<>(Arrays.asList(1, 2));
        Assertions.assertEquals(actual3, App.take(numbers1, 2));

        List<Integer> actual4 = new ArrayList<>(List.of(1));
        Assertions.assertEquals(actual4, App.take(numbers1, 1));

        List<Integer> actual5 = new ArrayList<>(List.of());
        Assertions.assertEquals(actual5, App.take(numbers1, 0));

        List<Integer> actual6 = new ArrayList<>(List.of());
        Assertions.assertEquals(actual6, App.take(numbers1, -1));

        List<Integer> actual7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(actual7, App.take(numbers1, 8));
        // END
    }
}
