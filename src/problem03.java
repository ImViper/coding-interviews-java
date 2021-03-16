/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem03 {
    public static int findRepeatNumber(int[] nums){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0 || nums[i]>nums.length-1) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                int tmp = nums[i];
                nums[i]=nums[tmp];
                nums[tmp]=tmp;
            }
        }
        return -1;
    }

    public static int findRepeatNumber1(int[] nums){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0 || nums[i]>nums.length-1) {
                return -1;
            }
        }
        int start = 1;
        int end = nums.length-1;
        while (start<=end){
            int mid = (start+end) >> 1;
            int count = countRange(nums,start,mid);
            if(end==start){
                if(count>1)
                    return start;
                else
                    break;
            }
            if(count>(mid-start)+1){
                end=mid;
            }else
                start=mid+1;
        }
    return -1;
    }

    public static int findDuplicate(int[] intArray) {
        // 杜绝数组为空
        if (intArray.length == 0) {
            return -1;
        }
        // 杜绝数组有非法数字
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 1 || intArray[i] > intArray.length - 1) {
                return -1;
            }
        }
        int start = 1;
        int end = intArray.length - 1;

        while (end >= start) {
            // >> 右移一位相当于除以2
            int middle = ((end + start) >> 1);
            int count = countRange(intArray, start, middle);
            // 终止条件
            if (start == end) {
                if (count > 1) {
                    return middle;
                } else {
                    break;
                }
            }
            if (count > (middle - start) + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }

        }
        return -1;

    }

    private static int countRange(int[] nums, int start, int end) {
        if(nums.length==0)
            return 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=start && nums[i]<=end){
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array=new int[]{0,1,0};
        System.out.println(findDuplicate(array));

    }
}
