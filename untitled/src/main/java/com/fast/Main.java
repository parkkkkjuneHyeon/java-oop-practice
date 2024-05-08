package com.fast;

import com.fast.logic.BubbleSort;
import com.fast.service.SortService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortService service = new SortService(new BubbleSort<>());

        System.out.println("Result : " + service.doSort(Arrays.asList(args)));
    }
}
