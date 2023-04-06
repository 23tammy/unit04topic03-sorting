import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> inputItems;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        StringListSort.selectionSort(inputItems);
        expectedOutput = new ArrayList<>(Arrays.asList("is", "mountain", "the", "there"));
        actualOutput = inputItems;
        assertEquals(expectedOutput, actualOutput);
    }
}
