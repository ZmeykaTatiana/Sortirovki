package controller;

import bubbleSort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]array={0,9,4,15,-5,3,-115};
        System.out.println(Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
