import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Author:Viper
 * Data:2021/3/10
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class problem06 {
      public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public int[] reversePrint(ListNode head) {
        if(head==null)
            return new int[0];
        Stack<Integer> stack = new Stack<>();
        while(head.next!=null){
            stack.push(head.val);
            head=head.next;
        }
        stack.push(head.val);
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i<size; i++) {
            res[i]=stack.pop();
        }
        return res;
    }
}