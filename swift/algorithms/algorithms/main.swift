//
//  main.swift
//  algorithms
//
//  Created by L on 2/15/18.
//  Copyright © 2018 Aleksey Egorov. All rights reserved.
//

import Foundation

let sortAlgo = InsertionSort<Int>();

var a = Array<Int>();
for i in 1...10 {
    a.append(10 - i)
}

for i in 0...9 {
    print(a[i]);
}

sortAlgo.sort(a: &a)


for i in 0...9 {
    print(a[i]);
}

