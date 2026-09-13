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
    public ListNode partition(ListNode head, int x) {

        ListNode small_dummy = new ListNode(0);
        ListNode big_dummy = new ListNode(0);
        ListNode small = small_dummy;
        ListNode big = big_dummy;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val >= x) {
                big.next = temp;
                big = big.next;
            }

            else {
                small.next = temp;
                small = small.next;
            }

            temp = temp.next;
        }

        big.next = null;
        small.next = big_dummy.next;

        return small_dummy.next;

    }
}