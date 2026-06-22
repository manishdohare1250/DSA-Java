package _00__Random_number_generation.By_SecureRandom_class_Best_way;

import java.util.Random;

public class _03_Generate_a_8_Character_passowrd {
    void main() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        System.out.println(str.length());
        Random r = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int num = r.nextInt(62);
            password.append(str.charAt(r.nextInt(str.length())));

        }

        IO.println("Your Random alphanumeric  character is:  " + password);

    }

}
