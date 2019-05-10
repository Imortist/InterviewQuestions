package com.home;

import org.junit.Test;

import static org.junit.Assert.*;


public class SumToRandNumTest {
    private int[] n = {1,2,3,4,5,6,7,8,9};

    @Test
    public void testNum2(){
        assertTrue(DailyIQ.doesItAddUp(n, 2));
    }
    @Test
    public void testNum20(){
        assertFalse(DailyIQ.doesItAddUp(n, 20));
    }

    @Test
    public void test17(){
        int[] nums= {10,15,3,7};
        assertTrue(DailyIQ.doesItAddUp(nums,17));
    }
}
