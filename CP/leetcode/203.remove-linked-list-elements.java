/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode c=head;
        ListNode prev=head;
        while(c!=null){
            if(c.val == val && c==head){
                head=c.next;
                
            }
            else if(c.val==val){
                prev.next = c.next;
                c=prev;
            }
            prev = c;
            c=c.next;
        }
        return head;   
    }
}
// @lc code=end

