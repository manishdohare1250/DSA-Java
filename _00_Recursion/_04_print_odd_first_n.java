public class _04_print_odd_first_n {
    void main() {
        int num = Integer.parseInt(IO.readln("Enter the number till you want to print odd numbers"));
        printOddInReverse(num);
        IO.println();
        printOddInNatural(num);
    }

    public static void printOddInReverse(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 == 1) {
            IO.println(n);
        }

        printOddInReverse(n - 1);

    }

    public static void printOddInNatural(int n) {
        if (n == 0) {
            return;
        }
        printOddInNatural(n - 1);

        if (n % 2 == 1) {
            IO.println(n);
        }

    }
}
