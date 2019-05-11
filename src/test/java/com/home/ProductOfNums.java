package com.home;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfNums {
    private DailyIQ diq = new DailyIQ();

    @Test
    public void test12345() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = {120, 60, 40, 30, 24};
        for (int i = 0; i < result.length; i++)
            assertEquals(result[i], diq.produceOfNumsInArray(nums)[i]);
    }

    @Test
    public void test321(){
        int[] nums = {3,2,1};
        int[] result = {2,3,6};
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i], diq.produceOfNumsInArray(nums)[i]);
        }
    }
}