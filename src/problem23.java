/**
 * Author:Viper
 * Data:2021/3/24
 * description:
 */
public class problem23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode findNode(ListNode head){
        if(head==null) return  null;
        ListNode slow = head.next;
        if(slow==null) return null;
        ListNode fast = slow.next;
        while (fast != null && slow!=null){
            if(fast == slow)
                return fast;
            slow = slow.next;
            fast= fast.next;
            if(fast.next!=null)
                fast=fast.next;
        }
        return null;
    }
    public ListNode EntryNodeOfLoop(ListNode head){
        int count = 1;
        ListNode meetNode = findNode(head);
        if (meetNode == null) return  null;
        ListNode pfind = meetNode.next;
        while (pfind!=meetNode){
            count++;
            pfind= pfind.next;
        }
        pfind = head;
        for (int i = 0; i < count; i++) {
            pfind=pfind.next;
        }
        meetNode=head;
        while (pfind!=meetNode){
            meetNode=meetNode.next;
            pfind=pfind.next;
        }
        return pfind;
    }
}
