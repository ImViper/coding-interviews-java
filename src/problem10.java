/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem10 {
    public int fib(int n){
        int a=0,b=1,sum;
        for (int i = 0; i <n; i++) {
            sum=(a+b)%1000000007;
            a=b;
            b=sum;
        }
        return a;
    }
}
