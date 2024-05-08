package com.fast.service;

import com.fast.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService service = new SortService(new BubbleSort<String>());
    @Test
    void sortServiceTest() {
        //given

        List<String> list = Arrays.asList("5","2","4","3","1");

        //when
        List<String> resultList = service.doSort(list);

        //then
        assertEquals(Arrays.asList("1","2","3","4","5"), resultList);

    }
}