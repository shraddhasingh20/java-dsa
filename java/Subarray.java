public class Subarray {

    public static int MaxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {
        Subarray sa=new Subarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(sa.MaxSubArray(nums));
    }
}