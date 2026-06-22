package _00__Random_number_generation.By_SecureRandom_class_Best_way;

import java.security.SecureRandom;

public class _01_N_digit_otp_including_leading_zero {
 public static void main(String[] args) {
    
     SecureRandom s= new SecureRandom();
     int num=s.nextInt(10_00_000);
     String num1=String.format("%06d",num);
     System.out.println("number:"+num1);
 }

}
