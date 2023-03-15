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
        int jin = 0;
        ListNode newList = new ListNode(0);
        ListNode temp1 = l1,Temp2 = l2,temp3 = newList;
        while(temp1!=null||temp!=null){
            int a = temp1==null ?0:temp1.val;
            int b = temp2==null ?0:temp2.val;
            int now = a + b + jin;
            if(now>=10) {
                jin = 1;
                now -= 10;
            }else{
                jin = 0;
            }
            temp3.val = now;
            temp3.next = new ListNode;
            temp3 = temp3.next;
        }

        return newList;
    }
}