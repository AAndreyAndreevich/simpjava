package tasks.simpleTasks.arraysTasks;

import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(RunningSumOf1dArray.runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

}