public class _06_Calculate_powerValue_of_given_number {
    void main() {

        int baseNumber = Integer
                .parseInt(IO.readln("Enter the base value for  which we have to calculate power value:"));
        int power = Integer.parseInt(IO.readln("Enter the  power value:"));

        if (power < 0) {
            IO.println("Enter the  positive value for power");
        } else {

            int result = calculatePower(baseNumber, power);
            IO.println(result);
        }

    }

    public static int calculatePower(int base, int pow) {
        int powValue = 1;
        if (pow == 0) {
            return powValue;
        }

        powValue = base * calculatePower(base, pow - 1);
        return powValue;
    }

}
