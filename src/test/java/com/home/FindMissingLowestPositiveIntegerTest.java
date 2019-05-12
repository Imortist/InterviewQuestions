package com.home;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMissingLowestPositiveIntegerTest {

    private DailyIQ diq = new DailyIQ();

    @Test
    public void returns2() {
        int[] nums = {3, 4, -1, 1};
        assertEquals(2, diq.findLowestPositiveInteger(nums));
    }

    @Test
    public void returns3() {
        int[] nums = {1, 2, 0};
        assertEquals(3, diq.findLowestPositiveInteger(nums));
    }

    @Test
    public void returns0(){
        int[] nums = {1,2,3};
        assertEquals(0, diq.findLowestPositiveInteger(nums));
    }
}
