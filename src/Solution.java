/**
 * Author:Viper
 * Data:2021/3/16
 * description:
 */
/**
 *
 * @author Snailclimb
 * @date 2018年9月19日
 * @Description: TODO
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //非递归遍历
    public ListNode reverseList(ListNode head){
        ListNode pre = null, cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        new Solution().reverseList(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next;
        }
    }

}

