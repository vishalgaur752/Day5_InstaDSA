public class MaxConsecutiveOnes {
    public static int maxConsecutive(int nums[]) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
        
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 0, 1};
        System.out.println(maxConsecutive(nums));
    }
}