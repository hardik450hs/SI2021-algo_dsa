/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode c = new ListNode();
        c= head;
        int count = 0;
        while(c!=null){
            count++;
            c = c.next;
        }
        c = head;
        count=count/2;
        while(count> 0){
            
            count--;
            c=c.next;
        }
        return c;
    }
}
// @lc code=end

