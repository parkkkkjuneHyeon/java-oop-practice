package com.fast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void mainTest() {
        //given
        String[] args = {"5", "2", "3","1","4"};
        //when & then
        Main.main(args);
    }
}