package tasks.simpleTasks.numericTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    //Брутфорс-решение
    public static List<Integer> twoSumBruteForce(int[] m1, int target) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = i + 1; j < m1.length; j++) {
                if (m1[i] + m1[j] == target) {
                    return List.of(i+1, j+1);
                }
            }
        }
        return null;
    }
    //Решение с использованием хэш-таблицы (O(n) по времени)
    public static List<Integer> twoSumHashTable(int[] m1, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m1.length; i++) {
            int complement = target - m1[i];
            if (map.containsKey(complement)) {
                return List.of(map.get(complement) + 1, i + 1);
            }
            map.put(m1[i], i);
        }
        return null;
    }
    //Оптимальное решение для отсортированного массива (O(n) по времени, O(1) по памяти)
    public static List<Integer> twoSumTwoPointers(int[] m1, int target) {
        int left = 0;
        int right = m1.length - 1;
        while (left < right) {
            int sum = m1[left] + m1[right];
            if (sum == target) {
                return List.of(left + 1, right + 1);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }
    //Решение с бинарным поиском (O(n log n) в худшем случае)
    public static List<Integer> twoSumBinarySearch(int[] m1, int target) {
        for (int i = 0; i < m1.length; i++) {
            int complement = target - m1[i];
            int index = Arrays.binarySearch(m1, i + 1, m1.length, complement);
            if (index >= 0) {
                return List.of(i + 1, index + 1);
            }
        }
        return null;
    }

}