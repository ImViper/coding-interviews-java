import java.util.LinkedList;

/**
 * Author:Viper
 * Data:2021/3/11
 * description:
 */
public class problem13 {
    int sums(int x )
    {
        int s=0;
        while(x!=0){
            s+=x%10;
            x=x/10;
        }
        return s;
    }
    public int movingCount(int m,int n,int k){
        boolean[][] visited=new boolean[m][n];
        int res =0;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] x = queue.poll();
            int i=x[0],j=x[1];
            if(i>=m||j>=n||k<(sums(i)+sums(j))||visited[i][j])
                continue;
            visited[i][j]=true;
            res++;
            queue.add(new int[]{i+1,j});
            queue.add(new int[]{i,j+1});
        }
        return res;
    }

}
