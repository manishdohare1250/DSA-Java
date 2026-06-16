
public class _10_Find_largest_digit_in_given_number {

    public static void main(String[] args) {
        int num = 587324;
        System.out.println("Largest Digit = " + largestDigit(num));
    }

    public static int largestDigit(int num) {

        if (num < 10) {      // Base case
            return num;
        }

        int digit = num % 10;
        int largestInRemaining = largestDigit(num / 10);

        return Math.max(digit, largestInRemaining);
    }
}
