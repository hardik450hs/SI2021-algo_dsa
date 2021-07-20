/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode c = head;
        boolean ans = true;
        while(c!=null){
            s.push(c.val);
            c=c.next;
            
        }
        c=head;
        while(!s.empty() && c!=null){
            if(s.peek()!=c.val){
                ans=false;
                break;
            }
            s.pop();
            c=c.next;
        }
        return ans;
    }
}
// @lc code=end

