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
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode nonDup = head.next;

        while(temp != null && nonDup != null){
            if(temp.val == nonDup.val){
                nonDup = nonDup.next;
            } else{
                temp.next = nonDup;
                temp = temp.next;
            }
        }
        temp.next = null;
        return head;
    }
}