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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode newH = head.next;
        ListNode prev=head;
        ListNode curr=head.next.next;
        
        newH.next=prev;
        prev.next=curr;
    

        

        while(curr!=null && curr.next!=null){
            ListNode first = curr;
            ListNode second = curr.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;

            prev=first;
            // curr=first.next;
            curr=curr.next;

        }

        return newH;
        
    }
}


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
// class Solution {
//     public ListNode swapPairs(ListNode head) {

//         ListNode dummy = new ListNode(0);
//         ListNode prev = dummy;

//         dummy.next=head;
        
//         while(prev.next!=null && prev.next.next!=null){
//             ListNode first = prev.next;
//             ListNode second = first.next;

//             first.next = second.next;
//             second.next = first;
//             prev.next=second;
//             prev=first;
//         }

//         return dummy.next;
        
//     }
// }