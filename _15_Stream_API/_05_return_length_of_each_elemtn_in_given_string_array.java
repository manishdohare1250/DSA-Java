package _15_Stream_API;

import java.util.Arrays;

public class _05_return_length_of_each_elemtn_in_given_string_array {
    public static void main(String[] args) {

        String[] str = { "Java", "is", "awesome" };

        Integer[] result = Arrays.stream(str)
                .map(s -> s.length())
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(result));
    }

}
