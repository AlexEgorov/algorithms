package com.yahorau.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class QuickSort <T extends Comparable<T>> {
    private Random random = new Random(System.currentTimeMillis());

    public void sort(T[] v, int left, int right, Comparator<T> cmpr) {
        if (left >= right) {
            // no need to do anything.
            return;
        }

        swap(v, left, left + random.nextInt(right - left));
        int last  = left;

        for (int i = left + 1; i <= right; i++) {
            if (cmpr.compare(v[i], v[left]) < 0) {
                swap(v, ++last, i);
            }
        }

        swap(v, left, last);
        sort(v, left, last - 1, cmpr);
        sort(v, last + 1, right, cmpr);
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class QuickSortTest {
    public static void main(String args[]) {
        QuickSort ms = new QuickSort();
        int n = 10;
        Integer a[] = new Integer[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(a));
        ms.sort(a,0, a.length - 1, Comparator.naturalOrder());
        System.out.println(Arrays.toString(a));
    }
}