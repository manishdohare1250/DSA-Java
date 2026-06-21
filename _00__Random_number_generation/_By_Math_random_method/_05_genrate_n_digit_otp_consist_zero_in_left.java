package _00__Random_number_generation._By_Math_random_method;

public class _05_genrate_n_digit_otp_consist_zero_in_left {

    public static void main(String[] args) {
        System.out.println();
        int randomNumber = (int) (Math.random() * 9999);
        System.out.println(String.format("%04d", randomNumber));

    }

}
