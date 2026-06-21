package _00__Random_number_generation._By_Math_random_method;

public class _04_generate_exact_n_digit_otp_zero_will_not_come_in_left {

    public static void main(String[] args) {
        // 4 digit otp without 0 in left ,,,,  
        int min = 1000;
        int max = 9999;

        int num = min + (int) (Math.random() * (max - min + 1));

        System.out.println(num);

    }

}
