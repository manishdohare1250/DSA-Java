package _00__Random_number_generation.By_Random_class;

import java.util.Random;

public class _03_Generate_A_Random_digit_bw_0_to_9 {

    void main() {

        Random r = new Random();

        char RandomDigit = (char) ('0' + r.nextInt(10));
        System.out.println("Random Digit is:" + RandomDigit);
    }

}
