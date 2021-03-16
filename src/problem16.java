/**
 * Author:Viper
 * Data:2021/3/12
 * description:
 */
public class problem16 {
    int[] res;
    char[] nums;
    int count=0;
    int x=0;
    public int[] printNumbers(int n){
        nums = new char[n];
        res = new int[(int)Math.pow(10,n)-1];
        dfs(x,n);
        return res;
    }

    private void dfs(int x, int n) {
        if(x==n){
            String str = String.valueOf(nums);
            int temp = Integer.valueOf(str);
            if(temp!=0){
                res[count++]=temp;
                return;
            }
            return;
        }
        for(char c ='0';c<='9';c++){
            nums[x]=c;
            dfs(x+1,n);
        }
    }
}
