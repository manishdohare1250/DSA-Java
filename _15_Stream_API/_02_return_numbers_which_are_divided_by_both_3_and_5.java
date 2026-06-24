package _15_Stream_API;

import java.util.Arrays;

public class _02_return_numbers_which_are_divided_by_both_3_and_5 {

    public static void main(String[] args) {
        // return the numbers which are divisible by both 3 and 5
        int[] array = { 15, 20, 25, 30, 35, 45, 75, 69, 47 };
        int[] result = Arrays.stream(array)
                .distinct()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .toArray();

        System.out.println(Arrays.toString(result));

    }

}
