package com.hust.zx;

import java.util.Arrays;

/**
 * Created by zx on 2016/4/16.
 */
public class ArrayBuilder {

    public static int[] buildIntArray(String numbers){
        String[] numberStrings = numbers.split(",");
        int[] result = new int[numberStrings.length];
        for(int i = 0; i < result.length; i ++){
            result[i] = Integer.parseInt(numberStrings[i]);
        }
        return result;
    }

    public static void showIntArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
