import java.util.Stack;

class Solution1 {
    public static String removeDuplicates(String s,int k) {
        StringBuilder tmp = new StringBuilder(s);
       Stack<Integer> stack = new Stack<>();
       for(int i =0;i<tmp.length();i++){
           if(i==0 || tmp.charAt(i)!=tmp.charAt(i-1)){
               stack.push(1);
           }else {
               int incresment = stack.pop() + 1;
               if (incresment == k) {
                   tmp.delete(i - k + 1, i + 1);
                   i = i - k;
               } else
                   stack.push(incresment);
           }
       }
       return tmp.toString();
    }

    public static void main(String[] args) {
        String a = "aaabbbaccc";
        System.out.println(removeDuplicates(a,3));
    }
}