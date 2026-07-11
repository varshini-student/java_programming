// reverse nodes in kth Group
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1) return head;
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode pGrpEnd = dum;
        while(true){
            ListNode kthNode = formGroup(pGrpEnd, k);
            if(kthNode==null) break;
            ListNode gStart = pGrpEnd.next;
            ListNode nStart = kthNode.next;
            // reverse
            ListNode prev = nStart;
            ListNode cur = gStart;
            while(cur!=nStart){
                ListNode temp = cur.next;
                cur.next = prev;
                prev=cur;cur=temp;
            }
            pGrpEnd.next = kthNode;
            pGrpEnd = gStart;
        }
        return dum.next;
    }
    public static ListNode formGroup(ListNode node, int k){
        while(node!=null&&k>0){
            node=node.next;
            k--;
        }
        return node;
    }
    }
