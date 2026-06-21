package _00__Random_number_generation._By_Math_random_method;

public class _02_genrating_random_number__bw_first_n_number_using_math_random_method {

    public static void main(String[] args) {
        int  d=(int) ( Math.random()*1000);// by multipling the range of random number is generating is number-1
      // it will genrate from 0 to 6;, it may genrate 1 digit,2 digit, 3 digit because if 0 comes in left side it will ignore and print next
    System.out.println("Your random number is: "+d);


    }

}
