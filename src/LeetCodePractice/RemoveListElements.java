package LeetCodePractice;

public class RemoveListElements {
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

            ListNode curr = head;
            ListNode prev = null;

            while (curr != null){

                ListNode temp = curr.next;
                if(curr.val == val){
                    if(curr == head)
                    {
                        head = curr.next;
                    }
                    else
                    {
                        prev.next = temp;
                    }
                }
                else{
                    prev = curr;
                }
                //curr = curr.next;
                curr = temp;

            }
            //curr would be null;
            return head;

        }
    }
}
