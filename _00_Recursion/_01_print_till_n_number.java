public class _01_print_till_n_number {

    public static void main(String[] args) {
        int number = Integer.parseInt(IO.readln("Enter the  number till you want to print:"));
          //print number in reverse
        printNumberIn_Reverse(number);


        IO.println("-----------------------");
        //print numbers in increasing order
        printNumberIn_NaturalOrder(number);
    }


    ////print numbers in increasing order function
    public static void printNumberIn_NaturalOrder(int n) {
        if (n == 0) {
            return;
        }
        printNumberIn_NaturalOrder(n - 1);
        System.out.println(n);
    }

    //print number in reverse
    public static void printNumberIn_Reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumberIn_Reverse(n - 1);
    }
    


}
