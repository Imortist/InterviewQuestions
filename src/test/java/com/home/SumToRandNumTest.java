package com.home;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SumToRandNumTest {
    private int[] n = {1,2,3,4,5,6,7,8,9};
    private DailyIQ dIQ = new DailyIQ();

    @Test
    public void testNum2(){
        assertTrue(dIQ.doesItAddUp(n, 2));
    }
    @Test
    public void testNum20(){
        assertFalse(dIQ.doesItAddUp(n, 20));
    }

    @Test
    public void test17(){
        int[] nums= {10,15,3,7};
        assertTrue(dIQ.doesItAddUp(nums,17));
    }
}
