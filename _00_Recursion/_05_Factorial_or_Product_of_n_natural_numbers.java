public class _05_Factorial_or_Product_of_n_natural_numbers {
    void main() {

        int num = Integer.parseInt(IO.readln("entert the number till you want to find the product:"));
        int result=findProduct(num);
        IO.println(result);

    }

    public static int findProduct(int n) {
        int product = 1;
        if (n == 0) {
            return product;
        }
        product = n * findProduct(n - 1);
        return product;
    }
}
