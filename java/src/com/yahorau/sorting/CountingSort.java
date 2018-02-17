package com.yahorau.sorting;

import java.util.Arrays;

public class CountingSort {
    public void sort(int arr[]) {
        int n = arr.length;
        int aux[] = new int[n];
        Arrays.fill(aux, 0);

        for (int i = 0; i < n; i++) {
            aux[arr[i]]++;
        }

        for (int i = 0, k = 0; i < n; i++) {
            for (int j = 0; j < aux[i]; j++) {
                arr[k + j] = i;
                k++;
            }
        }
    }
}

class CountingSortTest {
    public static void main(String args[]) {
        CountingSort ms = new CountingSort();
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
