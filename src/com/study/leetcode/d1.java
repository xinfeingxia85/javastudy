package com.study.leetcode;

import java.util.Stack;

public class d1 {

	public static void main(String[] args) {
		String testCase = "()[]{}1";
		System.out.println(isValid(testCase));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if (c == '('){
				stack.push(')');
			} else if (c == '{'){
				stack.push('}');
			} else if (c=='['){
				stack.push(']');
			}else if (stack.isEmpty() || stack.pop()!=c){
				return false;
			}
		}
		return stack.isEmpty();
	}
}
