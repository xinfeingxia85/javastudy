package com.study.leetcode;

import java.util.HashMap;
import java.util.Map;

public class d2 {

	public static void main(String[] args) {
		int[] nums = new int[]{3,2,4};
		int[] results = twoSum(nums, 6);
	    System.out.println(results[0]+"--"+results[1]);
	}

	public static int[] twoSum(int[] nums, int target){
		int results[] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])){
				results[1] = i;
				results[0] = map.get(target-nums[i]);
				return results;
			}
			map.put(nums[i], i);
		}
		return results;
	}
}
