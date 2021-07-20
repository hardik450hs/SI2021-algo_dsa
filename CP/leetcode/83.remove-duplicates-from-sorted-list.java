/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode c = head;
        ListNode p = head;
        while(c!=null){
            if(c.val==p.val){
                p.next = c.next;
                c=p;
            }
            p=c;
            c=c.next;
        }
        return head;
    }
}
// @lc code=end

