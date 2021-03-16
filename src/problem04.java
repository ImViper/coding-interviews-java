/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=0,j = matrix[0].length-1;
        while(j>=0 && i<=matrix.length-1){
            int now = matrix[i][j];
            if(now==target)
                return true;
            if(now>target)
                j=j-1;
            else
                i=i+1;
        }
        return false;
    }
}

