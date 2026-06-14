public class _03_print_even_first_n {
    void main() {
        int num = Integer.parseInt(IO.readln("Enter the number till you want to print even numbers"));
        printEvenInReverse(num);
        IO.println();
        printEvenInNatural(num);
    }

    public static void printEvenInReverse(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 == 0) {
            IO.println(n);
        }

        printEvenInReverse(n - 1);

    }

    public static void printEvenInNatural(int n) {
        if (n == 0) {
            return;
        }
        printEvenInNatural(n - 1);

        if (n % 2 == 0) {
            IO.println(n);
        }

    }
}
