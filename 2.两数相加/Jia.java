class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jin = 0;
        ListNode newList = new ListNode(0);
        ListNode temp1 = l1,temp2 = l2,temp3 = newList;
        while(temp1!=null||temp2!=null){
            temp3.next = new ListNode();
            temp3 = temp3.next;
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
            if(temp1!=null)
                temp1 = temp1.next;
            if(temp2!=null)
                temp2 = temp2.next;
        }
        if(jin == 1){
            temp3.next = new ListNode();
            temp3 = temp3.next;
            temp3.val = 1;
        }

        return newList.next;
    }
}