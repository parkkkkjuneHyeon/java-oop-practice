package com.fast.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 - 정렬테스트")
    @Test
    void JavaSortTest() {
        //given
        JavaSort<String> javaSort = new JavaSort<>();
        List<String> list = Arrays.asList("5","2","4","3","1");

        //when
        List<String> resultList = javaSort.sort(list);

        //then
        assertEquals(Arrays.asList("1","2","3","4","5"), resultList);
    }

}