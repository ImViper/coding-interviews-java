
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param buttons int整型一维数组
     * @return long长整型
     * 没有转long就会报错，所以一定要转。
     */
    public long findMaxButtons (int[] buttons) {
        // write code here
        long count = 0;
        for(int i =0;i<buttons.length;i++){
            if(buttons[i]==1) {
                count += 1;
                continue;
            }
            else{
                long tmp = (i+1)*(buttons[i]-1)+1;
                count+=tmp;
            }
        }
        return count;
    }
    public long findMinButtons2(int[] a){
        long res = a.length;
        for (int i = 0; i < a.length; i++) {
            res+=(long) (a[i]-1)*(i+1);
        }
        return res;
    }
}