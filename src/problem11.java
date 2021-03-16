/**
 * Author:Viper
 * Data:2021/3/11
 * description:
 */
public class problem11 {
    public int minArray(int[] numbers) {
        int len =numbers.length;
        if(len==0)
            return 0;
        int i=0,j=len-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if(numbers[mid]<numbers[j])
                j=mid;
            else if(numbers[mid]==numbers[j])
                j--;
            else
                i=mid+1;
        }
        return numbers[i];
    }
}
