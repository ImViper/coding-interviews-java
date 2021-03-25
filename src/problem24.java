/**
 * Author:Viper
 * Data:2021/3/24
 * description:
 */
public class problem24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode reversehead = null;
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            ListNode next = cur.next;
            if(next==null)
                reversehead = cur;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return reversehead;
    }

}
