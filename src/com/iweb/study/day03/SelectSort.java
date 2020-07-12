package com.iweb.study.day03;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {14,56,42,45,67,65,43,33};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] =temp;
                }
            }
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
