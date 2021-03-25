import java.util.Scanner;

/**
 * Author:Viper
 * Data:2021/3/18
 * description:
 */
public class shuaqiang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //开始连一个空格，使得s.charAt(0)为空，数组从1开始，方便计算。
        String s = ' '+sc.next();
        int[] sum = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            sum[i]=sum[i-1]+s.charAt(i)-'0';
        }
        int res = n;
        for(int i=0;i<=n;i++){
//            [1,i]中0的个数为i-sum[i]
//            [i+1, n]中‘1’的个数为sum[n]-sum[i]
            res = Math.min(res,i-sum[i]+sum[n]-sum[i]);
        }
    }
}
