package com.hust.zx;

/**
 * Created by zx on 2016/4/16.
 */
public class MainClass {

    public static void main(String[] args){
        Solution solution = new Solution();

        int[] inputDigits= ArrayBuilder.buildIntArray("9,9,9,9,9");
        int[] result = solution.plusOne(inputDigits);
        ArrayBuilder.showIntArray(result);
    }

}
