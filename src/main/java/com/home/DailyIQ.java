package com.home;

import java.util.Arrays;

class DailyIQ {

    boolean doesItAddUp(int[] nums, int k) {
        for (int i : nums) {
            for (int j : nums) {
                if (i + j == k) return true;
            }
        }
        return false;
    }


    int[] produceOfNumsInArray(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int valueAtI;

        for (int i = 0; i < nums.length; i++) {
            int val = 1;
            valueAtI = nums[i];
            nums[i] = 1;

            for (int j : nums) {
                val *= j;
            }
            nums[i] = valueAtI;
            result[i] = val;
        }

        return result;
    }

    int findLowestPositiveInteger(int[] nums) {
        int lowestInt = nums[0];

        for (int i : nums) {
            if (i < lowestInt && i >= 0) lowestInt = i;
        }
        do{
            lowestInt++;
        } while(Arrays.asList(nums).contains(lowestInt));
        return lowestInt;
    }
}

