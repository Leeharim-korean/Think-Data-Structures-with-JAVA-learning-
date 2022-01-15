public class SelectionSort {
    public static void swapElements(int[] array, int i, int j) { // O[1]
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int indexLowest(int[] array, int start) { // O[n-start]=O[n]
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public static void selectionSort(int[] array) { // O[n^2]
        for (int i = 0; i < array.length; i++) { // O[n(n+1)/2+1*n]=O[n^2]
            int j = indexLowest(array, i); // O[n-i]=O[n]
            swapElements(array, i, j); // O[1]
        }
    }
}
