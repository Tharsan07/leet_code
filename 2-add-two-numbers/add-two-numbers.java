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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     // Dummy node to start the result list
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
     // Traverse both lists until both are null and no carry is left
        while(l1!=null || l2!=null || carry!=0){
           int a=(l1!=null)? l1.val:0;
           int b=(l2!=null)? l2.val:0;
           int sum= a+b+carry;
           carry=sum/10;  // Update carry for next addition
           curr.next=new ListNode(sum%10);  // Create new node with current digit
           curr=curr.next;
           if(l1!=null) l1=l1.next;
           if(l2!=null) l2=l2.next;
        }
        return dummy.next; // Head of the result list
    }
}