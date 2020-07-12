package com.iweb.study.day03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {14, 56, 42, 45, 67, 65, 43, 33};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
