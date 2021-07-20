/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode Next = null;
        ListNode prev = null;
        if(head == null) return null;
        int count = 0;
        int size=1;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        System.out.println(size);
        while(curr !=null && count < k){
            Next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = Next;
            count++;
        }
        size=size-k;
        if(Next!=null){
            if(size>=k) head.next = reverseKGroup(Next,k);
            else{
                
                head.next=curr;
            }
        } 
        
        return prev;
    }
}
// @lc code=end

