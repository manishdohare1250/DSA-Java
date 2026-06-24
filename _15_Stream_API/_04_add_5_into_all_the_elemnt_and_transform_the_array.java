package _15_Stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

public class _04_add_5_into_all_the_elemnt_and_transform_the_array {

    void main() {

        Integer[] result = Stream.of(5, 6, 7, 8, 9, 10)
                .map(num -> num + 5)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(result));

    }

}
