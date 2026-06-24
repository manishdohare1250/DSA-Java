package _15_Stream_API;

import java.util.Arrays;

public class _03_return_element_starts_with_a_particular_character_or_word {

    public static void main(String[] args) {
        // return the fruits name which are starting with B character
        String[] fruits = { "Apple", "Bannana", "BlueBerry", "BlackBerry", "Mango", "Guava" };

        String[] result = Arrays.stream(fruits)
                .filter(s -> s.startsWith("B"))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));

    }
}
