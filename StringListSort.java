import java.util.ArrayList;
import java.util.Arrays;

public class StringListSort {

    public static void selectionSort(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++){
            int indexMin = i;
            String firstItem = items.get(i);
            for (int x = i + 1; x < items.size(); x++ ){
                if (items.get(x).compareTo(firstItem) < 0){
                    firstItem = items.get(x);
                    indexMin = x;
                }
            }
            String tmp = items.get(i);
            items.set(i, items.get(indexMin));
            items.set(indexMin, tmp);
            System.out.println(items);

        

        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("there", "is", "the", "a", "z", "mountain"));
        selectionSort(items);
    }
}