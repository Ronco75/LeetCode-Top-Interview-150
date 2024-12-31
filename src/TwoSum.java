import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementToTarget = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (complementToTarget.containsKey(nums[i])) {
                return new int[]{complementToTarget.get(nums[i]), i};
            }

            complementToTarget.put(target - nums[i], i);
        }
        return new int[]{-1,-1};
    }
}


