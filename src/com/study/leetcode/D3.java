package com.study.leetcode;
//Description
//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
public class D3 {

	public static void main(String[] args) {
		//构建2 -> 4 -> 3 的链表
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		ListNode p1 = l1.next;
		p1.next = new ListNode(3);
		
		//构建5->6->4 的链表
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		ListNode p2 = l2.next;
		p2.next = new ListNode(4);
		
		//调用函数并进行输出
		ListNode head = addTwoNumbers(l1, l2);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    if(l1==null) return l2;
	    if(l2==null) return l1;
	    
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	    
	    int tmp = 0;
	    while(l1!=null || l2!=null || tmp!=0) {
	        if(l1!=null) {
	            tmp += l1.val;
	            l1 = l1.next;
	        }
	        if(l2!=null) {
	            tmp += l2.val;
	            l2 = l2.next;
	        }
	        
	        p.next = new ListNode(tmp%10);
	        p = p.next;
	        tmp = tmp/10;
	    }
	    return head.next;
	}
}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
}
