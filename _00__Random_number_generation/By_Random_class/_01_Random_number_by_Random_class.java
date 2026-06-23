package _00__Random_number_generation.By_Random_class;

import java.util.Random;

public class _01_Random_number_by_Random_class {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(1000000);
        //String otp = String.format("%06d", num);
     //   int otpnum = Integer.parseInt(otp);
        System.out.println("num:" + num);
    }
}
