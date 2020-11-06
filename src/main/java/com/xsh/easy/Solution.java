package com.xsh.easy;

/**
 * @date 2020/11/6
 * 反转链表
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode tem = head.next;
            head.next = newHead;
            newHead = head;
            head = tem;
        }
        return newHead;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}