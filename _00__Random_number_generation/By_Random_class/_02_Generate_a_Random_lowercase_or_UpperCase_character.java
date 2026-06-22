package _00__Random_number_generation.By_Random_class;

import java.util.Random;

public class _02_Generate_a_Random_lowercase_or_UpperCase_character {
    void main() {
        Random r = new Random();

        char LowerCaseCharacter = (char) ('a' + r.nextInt(26));
        System.out.println("Random LowerCaseCharacter is:" + LowerCaseCharacter);

        char UpperCaseCharacter = (char) ('A' + r.nextInt(26));
        System.out.println("Random UpperCaseCharacter is:" + UpperCaseCharacter);

    }

}
