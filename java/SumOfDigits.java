public class SumOfDigits {

    // function to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = sumOfDigits(1234);
        System.out.println("Sum of digits: " + result);
    }
}