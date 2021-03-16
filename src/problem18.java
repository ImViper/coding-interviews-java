/**
 * Author:Viper
 * Data:2021/3/14
 * description:
 */
public class problem18 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode deleteNode(ListNode head, int val) {
            if(head==null)  return null;
            if(head.val==val) return head.next;
            ListNode cur = head;
            while(cur.next!=null && cur.next.val!=val){
                cur=cur.next;
            }
            if(cur.next.val==val)
                cur.next=cur.next.next;
            return head;

    }
}
