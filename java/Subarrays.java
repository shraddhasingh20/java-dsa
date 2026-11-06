public class Subarrays {

    public static int[] MaxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currSum + nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum = currSum + nums[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;   
            }
        }

        return new int[]{maxSum, start, end}; 
    }

    public static void main(String args[]) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int[] result = MaxSubArray(nums);

        System.out.println("Maximum Sum: " + result[0]);
        System.out.println("Start Index: " + result[1]);
        System.out.println("End Index: " + result[2]);

        // Print the subarray
        System.out.print("Subarray: ");
        for (int i = result[1]; i <= result[2]; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}