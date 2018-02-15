//
//  InsertionSort.swift
//  algorithms
//
//  Created by L on 2/15/18.
//  Copyright © 2018 Aleksey Egorov. All rights reserved.
//

import Foundation

class InsertionSort <T : Comparable> {

    func sort( a: inout Array<T>) {
        let size = a.count;
        for j in 1...size - 1 {
            let key = a[j];
            var i = j - 1
            
            while i >= 0 && a[i] > key {
                a[i + 1] = a[i]
                i -= 1
            }
            
            a[i + 1] = key
        }
    }
}
