package array;

import java.util.HashMap;
import java.util.Map;

// ý tưởng bài này: duyệt các số trong mảng và nhét vô MAP với : key là giá trị và value là index. Nếu target - key = nums --> return

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                output[0] = map.get(nums[i]);
                output[i] = i;
            }
            map.put(target - nums[i], i);
        }
        return output;
    }
}
