package com.home;

class DailyIQ {
    static boolean doesItAddUp(int[] nums, int k) {
        for(int i : nums){
           for(int j : nums){
               if(i+j == k) return true;
           }
        }
        return false;
    }
}
