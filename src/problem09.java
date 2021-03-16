import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public problem09() {
       stack1 = new Stack<>();
       stack2 = new Stack<>();
       LinkedList<Integer> a = new LinkedList<>();

    }

    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
       if(stack2.isEmpty()){
           while (!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
       if(stack2.isEmpty())
           return -1;
       else{
           return stack2.pop();
       }
    }
}
