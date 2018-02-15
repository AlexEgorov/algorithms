package com.yahorau.sorting;

import java.util.*;

public class InsertionSort<T extends Comparable> {

    /**
     *
     * @param a
     */
    private static void sort(int a[]) {
        // start from second element
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;

            // while element a[i] which is to the left of a[j] greater copy value from a[i] to a[i + 1]
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }

    /**
     *
     * @param a
     * @param comparator
     */
    public void sort(List<T> a, Comparator<T > comparator) {
        for (int j = 1; j < a.size(); j++) {
            T key = a.get(j);
            int i = j - 1;

            while (i >= 0 && comparator.compare(a.get(i), key) > 0) {
                a.set(i + 1, a.get(i));
                i--;
            }
            a.set(i + 1, key);
        }
    }

}

class InsertionSortTest {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add((int) (Math.random() * n));
        }

        InsertionSort<Integer> sort = new InsertionSort<>();
        sort.sort(a, Comparator.naturalOrder());
    }
}
