package LeetCodePractice;

public class MiddleOfLinkedList {
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
    /* Attempting to find and return the middle node of a linkedList;
    ~COMPLETED~
    I fucked up the solution kind of by doing counter/2 + 1 but after I decided to do just dividing. I still don't quite
    know why my solution did not work initially by adding plus one you can get to the middle right? I think the way
    that java works is that dividing an odd number by 2 will put you in the middle of the array/list/tree what-have-you.
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head;
            int counter = 0;

            while(p2 != null){
                p2 = p2.next;
                counter++;
            }

            counter = (counter/2 );


            int stepper = 0;
            while (stepper != counter){
                stepper++;
                p1 = p1.next;

            }
            return p1;
        }
    }
}
