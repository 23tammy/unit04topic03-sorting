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

    public static void insertionSort(ArrayList<String> items){
        for (int i = 1; i < items.size(); i++){ //goes through every item
            int j = i;
            while (j > 0 && items.get(j-1).compareTo(items.get(j)) > 0){
                String tmp = items.get(j-1);
                items.set(j-1, items.get(j));
                items.set(j, tmp);
                j--;
            }
            System.out.println(items);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList("there", "is", "the", "a", "z", "mountain"));
        // selectionSort(items);
        insertionSort(items);
    }
}