/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        Stack<Integer> s = new Stack<>();
        while(temp!=null){
            s.push(temp.val);
            temp = temp.next;
        }
        int[] end = new int[s.size()];
        int i = 0;
        while(s.size()>=1){
            end[i++] = s.pop();
        }
        return end;
    }
}