package org.xzw.day02;

/**
 * @author: XZW
 * @date: 2020/5/7 9:11
 * @desc: 求最长公共前缀
 **/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flush"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //String.indexOf() 查询子字符串在指定字符串中第一次出现的位置的索引
            while (strs[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
                if (s.isEmpty()) {
                    return "";
                }
            }
        }
        return s;
    }
}
