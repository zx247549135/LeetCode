package com.hust.zx;

/**
 * Created by zx on 2016/4/16.
 */
public class Solution {

    // OJ 66
    public int[] plusOne(int[] digits) {
        boolean needCopy = false;
        for(int i = digits.length - 1; i >= 0; i --){
            if(digits[i] + 1 >= 10){
                digits[i] -= 9;
                if(i == 0)
                    needCopy = true;
            }else{
                digits[i] += 1;
                break;
            }
        }
        if(needCopy){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length; i ++)
                result[i] = digits[i-1];
            return result;
        }else{
            return digits;
        }
    }

}
