package com.yahorau.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class BubbleSortTest {
    public static void main(String args[]) {
        BubbleSort ms = new BubbleSort();
        int n = 10;
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(a));
        ms.sort(a);
        System.out.println(Arrays.toString(a));
    }
}