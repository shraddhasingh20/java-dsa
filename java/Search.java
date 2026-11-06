public class Search {

    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int value = arr[mid / n][mid % n];

            if (target == value) {
                return true;
            } 
            else if (target > value) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {7, 9, 11}
        };

        int target = 9;

        System.out.println(searchMatrix(arr, target));
    }
}