import java.util.ArrayList;

public class StringListSort {

    public static void selectionSort(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++){
            int indexMin = i;
            String firstItem = items.get(0);
            for (int x = i + 1; x < items.size(); x++ ){
                if (items.get(x).compareTo(firstItem) < 0){
                    indexMin = i;
                    firstItem = items.get(indexMin);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
}