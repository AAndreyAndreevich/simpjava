package tasks.simpleTasks.arraysTasks;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }

}