package _15_Stream_API;

import java.util.Arrays;

public class _06_find_the_Cube_of_all_even_number_and_print_for_the_given_array {
    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] result = Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .map(num1 -> num1 * num1 * num1)
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
