package ooo1twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int sum = 9;
        System.out.println(Arrays.toString(Arrays.stream(twoSum(nums, sum)).toArray()));
    }


    private static int[] twoSum(int[] nums, int sum){
        int[] result = new int[2];
        if (nums == null || nums.length <= 1) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(sum - nums[i]) != null) {
                result[0] = map.get(sum - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
