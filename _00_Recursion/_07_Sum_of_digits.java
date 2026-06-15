public class _07_Sum_of_digits {
    void main() {
        int number = Integer.parseInt(IO.readln("Enter the number:"));
        int result = findSum(number);
        IO.println("DigitSum of given number is:" + result);

    }

    public static int findSum(int num) {
        int sum = 0;
        if (num == 0) {
            return sum;
        }
        sum = num % 10 + findSum(num / 10);
        return sum;
    }
}
