package LeetCodePractice;

public class DeleteNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public void deleteNode(ListNode node) {
            /*I did not solve this value by my own thinking but I used an answer from the comments and I quickly under-
            stood what they were doing. We only want to get rid of the Node, we have it's value to piggy back off of.
            What we do here is then move the value to the next node and move the next node to the next next node. We make
            the node.next to be the next next one and that detaches the pointer from the current node to the next node
            because the next node is now one node farther away.
             */
            node.val = node.next.val;
            node.next = node.next.next;

        }
    }
}
