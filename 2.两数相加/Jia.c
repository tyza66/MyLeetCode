/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *a,*out;
    int sum = 0,up = 0;
    a = (struct ListNode*)malloc(sizeof(struct ListNode));
    out = a;
    while(l1!=NULL&&l2!=NULL)
    {
        sum = l1->val + l2->val + up;
        if(sum>=10) {up = 1; sum-=10;} else {up = 0;}
        a->val= sum;
        if(l1->next!=NULL||l2->next!=NULL){
            a->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            a = a->next;}
        a->next = NULL;
        l1 = l1->next;
        l2 = l2->next;
    }

    if(l1==NULL&&l2!=NULL)
    {
        while(l2!=NULL)
        {
            sum = l2->val + up;
            if(sum>=10) {up = 1; sum-=10;} else {up = 0;}
            a->val= sum;
            if(l2->next!=NULL){
            a->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            a = a->next;}
            a->next = NULL;
            l2 = l2->next;
        }
    }
    if(l1!=NULL&&l2==NULL)
    {
        while(l1!=NULL)
        {
            sum = l1->val+ up;
            if(sum>=10) {up = 1; sum-=10;} else {up = 0;}
            a->val= sum;
            if(l1->next!=NULL){
            a->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            a = a->next;}
            a->next = NULL;
            l1 = l1->next;
        }
    }
    if(up==1)
    {
        a->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        a = a->next;
        a->val = up;
        a->next = NULL;
    }
    return out;
}
