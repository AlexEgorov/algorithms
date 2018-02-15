package com.yahorau.sorting;

import java.util.Arrays;

public class MergeSort {
   public void sort(int a[]) {
       mergeSort(a, 0, a.length - 1);
   }

   private void mergeSort(int a[], int lo, int hi) {
       if (lo < hi) {
           int mid = (hi + lo) / 2;
           mergeSort(a, lo, mid);
           mergeSort(a, mid + 1, hi);
           merge(a, lo, mid, hi);
       }
   }

   private void merge(int a[], int lo, int mid, int hi) {
        int n1 = mid - lo + 1;
        int n2 = hi - mid;

        int l[] = new int[n1 + 1];
        int r[] = new int[n2 + 1];


       for (int i = 0; i < n1; i++) {
           l[i] = a[lo + i];
       }

       for (int i = 0; i < n2; i++) {
           r[i] = a[mid + i + 1];
       }
       
       l[n1] = Integer.MAX_VALUE;
       r[n2] = Integer.MAX_VALUE;

       int i = 0;
       int j = 0;

       for (int k = lo; k <= hi; k++) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
       }

   }
}

class MergeSortTest {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int a[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;
        }

        System.out.println(Arrays.toString(a));
        ms.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
