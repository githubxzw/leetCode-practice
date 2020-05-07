# leetCode-practice
每日一题
### Day01
**RomanToInt**：罗马数字转Int整数    
思路：利用HashMap来存储罗马数字和对应的Int值，遍历传进来的string字符串，根据条件给sum值加就OK了。
### Day02
**LongestCommonPrefix**：最长公共前缀：
思路：取第一个字符串为判断的字符串，循环使用String.indexOf()判断是否是以这个字符串开头的，如果是则进入下一个字符串判断，如果不是则使用subString来截取字符串，如果截取到的字符串为空则返回"";
