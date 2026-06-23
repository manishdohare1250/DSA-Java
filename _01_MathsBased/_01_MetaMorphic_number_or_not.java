package _01_MathsBased;

/// whhen a numbers all digit come in the lastpart of the square of that number
/// 
public class _01_MetaMorphic_number_or_not {
    public static void main(String[] args) {

        int num = Integer.parseInt(IO.readln("Enter the Number:"));

        if (num == calculatePower(num, 2) % calculatePower(10, countDigit(num))) {
            System.out.println("Metamorphic");
        } else {
            System.out.println("Not metamorphic");
        }
    }

    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;

        }
        return count;

    }

    public static int calculatePower(int base, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * base;
        }
        return result;
    }
}
