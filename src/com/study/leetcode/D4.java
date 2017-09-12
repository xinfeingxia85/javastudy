package com.study.leetcode;

import java.util.HashMap;
import java.util.Map;
//description:
//Given a string, find the length of the longest substring without repeating characters.
//Examples:
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class D4 {

	public static void main(String[] args) {
		String s = "我爱对你的哈哈哈";
		System.out.println(lengthOfLongestSubString(s));
	}

	public static int lengthOfLongestSubString(String s) {
		int length = s.length();
		int max = 0;
		int p =0;
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(s.charAt(i))){
				p = Math.max(p, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-p+1);
		}
		return max;
	}
}
