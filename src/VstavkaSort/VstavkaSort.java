package VstavkaSort;

public class VstavkaSort {
    public static void sortbyVstavka(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int key = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (array[i] > key) {
                    array[i + 1] = array[i];
                } else {
                    break;

                }

            }
            array[i + 1] = key;
        }
    }
}

