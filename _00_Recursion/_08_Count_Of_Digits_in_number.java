public class _08_Count_Of_Digits_in_number {
    void main() {
        int num = Integer.parseInt(IO.readln("Enter the number:"));
        int result = countDigits(num);
        IO.println("DigitCount is:" + result);
    }

    public static int countDigits(int num) {
        int count = 0;
        if (num == 0) {
            return count;
        }

        count = count + 1 + countDigits(num / 10);
        return count;

    }

}
