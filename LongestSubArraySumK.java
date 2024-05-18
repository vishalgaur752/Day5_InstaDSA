import java.util.*;

public class LongestSubArraySumK {
    public static int longestSubArr(int nums[], int target) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - target)) {
                // ans += map.get(sum - target);
                ans = Math.max(ans, i-map.get(sum - target));
            }
            // map.put(sum, map.getOrDefault(sum, 0) + 1);
            map.put(sum, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 10, 5, 2, 7, 1, 9 };
        System.out.println(longestSubArr(nums, 15));
    }
}
