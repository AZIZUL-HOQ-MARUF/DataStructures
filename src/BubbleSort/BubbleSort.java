package BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {23, 12, -100, -50, 40, 1000, -20, 75};
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i<lastUnsortedIndex ; i++) {
                if (array[i] > array[i + 1]) {  
                    array[i] = array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }
        System.out.println("Sorted by ASC. ");
        for (int i = 0; array.length > i; i++) {

            System.out.println(array[i]);

        }
    }

//
//    public static void swap(int array[], int i, int j) {
//        if (i == j) {
//            return;
//        }
//        array[i] = array[i] + array[j];
//        array[j] = array[i] - array[j];
//        array[i] = array[i] - array[j];
//
//    }
}
