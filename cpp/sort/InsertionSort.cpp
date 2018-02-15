//
// Created by L on 2/15/18.
//

#include "InsertionSort.h"

template<class T>
void InsertionSort<T>::sort(T *arr, int length) {
    for (int j = 1; j < length; ++j) {
        T key = arr[j];
        int i = j - 1;

        while (i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];
            --i;
        }

        arr[i + 1] = key;
    }
}