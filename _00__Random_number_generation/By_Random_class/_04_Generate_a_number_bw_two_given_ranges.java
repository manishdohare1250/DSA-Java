package _00__Random_number_generation.By_Random_class;

import java.util.Random;

public class _04_Generate_a_number_bw_two_given_ranges {
    void main() {
        Random r = new Random();

        int num = r.nextInt(50, 59);
        System.out.println("num:" + num);
    }

}
