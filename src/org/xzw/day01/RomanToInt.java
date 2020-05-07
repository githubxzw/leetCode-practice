package org.xzw.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: XZW
 * @Date: 2020/5/4 16:17
 * @Description: 罗马数字转Int整数：罗马数字包含I,V,X,L,C,D,M
 *                               其中： I -> 1,V -> 5,X -> 10,L -> 50,C ->100,D -> 500,M -> 1000;
 */
public class RomanToInt {
    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }

    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if(i<chars.length-1){
                if(map.get(chars[i])<map.get(chars[i+1])){
                    sum+=map.get(chars[i+1])-map.get(chars[i]);
                    i++;
                }else{
                    sum+=map.get(chars[i]);
                }
            }else{
                sum+=map.get(chars[i]);
            }
        }
        return sum;
    }
}
