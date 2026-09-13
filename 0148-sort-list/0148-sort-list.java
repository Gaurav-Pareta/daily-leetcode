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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int[] arr = new int[length];
        
        int i = 0;
        temp = head;
        while(temp != null){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }

        Arrays.sort(arr);
        i=0;
        temp = head;
        while(temp != null){
            temp.val = arr[i];
            temp = temp.next;
            i++;
        }

        return head;
    }
}