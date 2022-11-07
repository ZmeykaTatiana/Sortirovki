package VyborSort;

public class VyborSort {
    public static void sortbyV(int[]array) {
        for (int i = 0; i < array.length ; i++) {
            int key=i;
            int min=array[i];
            for (int j = i+1; j < array.length ; j++) {
                if(array[j]<min){
                    key=j;
                    min=array[j];
                }

            }
            array[key]=array[i];
            array[i]=min;


        }





    }
}
