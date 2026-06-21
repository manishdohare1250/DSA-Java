package _00__Random_number_generation._By_Math_random_method;
import java.lang.Math;
//
public class _01_Generate_a_random_number_using_math_random_method {
    public static void main(String[] args) {
        double d=Math.random();//after decimal it may generate 15,16,17,18 digits,
        String str=d+"";
    System.out.println("Your random number is: "+d);
    System.out.println("Your random number decimal count  is: "+ (str.length()-2));;


    }

}
