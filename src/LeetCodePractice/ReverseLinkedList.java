package LeetCodePractice;

public class ReverseLinkedList {
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
        public ListNode reverseList(ListNode head) {
            //Set current equal to the first Node.
            //set previous equal to null because the list is going the opposite way
            //starting from the back

            ListNode cur = head;
            ListNode prev = null;

            while(cur != null)
            {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }


            return prev;
        }
    }

}
