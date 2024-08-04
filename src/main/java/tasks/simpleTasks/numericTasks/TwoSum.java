package tasks.simpleTasks.numericTasks;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(numbers[i], i);
        }
        return new int[]{};
    }

}