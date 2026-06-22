package _00__Random_number_generation.By_SecureRandom_class_Best_way;

import java.util.Random;

public class _02_Generate_an_Aphanumeric_character_randomaly {

    void main() {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        System.out.println(str.length());

        Random r = new Random();
        int num = r.nextInt(62);

        IO.println("Your Random alphanumeric  character is:  " + str.charAt(num));

    }
}
