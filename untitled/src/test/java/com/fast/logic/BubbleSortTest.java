package com.fast.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블소트 - 정렬테스트")
    @Test
    void bubbleSortTest() {
        //given
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        List<String> list = Arrays.asList("5","2","4","3","1");

        //when
        List<String> resultList = bubbleSort.sort(list);

        //then
        assertEquals(Arrays.asList("1","2","3","4","5"), resultList);
    }

}