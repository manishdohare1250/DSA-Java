package _15_Stream_API;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _01_Basic_Array_stream {

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 4, 5 };
        // 1. Stream.of(elements)
        System.out.println(" Stream.of(1,2,3,4,5)");
        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::print);

        System.out.println("\n");

        // 2. Stream.of(array)
        System.out.println(" Stream.of(array)");
        Stream.of(arr)
                .forEach(System.out::print);

        System.out.println("\n");

        // 3. Arrays.stream(array)
        System.out.println("Arrays.stream(array)");
        Arrays.stream(arr)
                .forEach(System.out::print);

        System.out.println("\n");

        // 4. Arrays.stream(new Array)
        System.out.println("Arrays.stream(new Integer[]{1,2,3,4,5})");
        Arrays.stream(new Integer[] { 1, 2, 3, 4, 5 })
                .forEach(System.out::print);

        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        int[] nums = { 10, 20, 30, 40, 50 };

        // 1. Stream.of(elements)
        IO.println();
        IO.println("Stream.of(1,2,3,4,5) by  storing into stream with integer genreics");
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
        s1.forEach(System.out::print);

        IO.println();
        // 2. Stream.of(array)
        Stream<Integer> s2 = Stream.of(arr1);
        s2.forEach(System.out::print);

        IO.println();
        // 3. Arrays.stream(Object Array)
        Stream<Integer> s3 = Arrays.stream(arr1);
        s3.forEach(System.out::print);

        IO.println();
        // 4. Arrays.stream(int[])
        IntStream s4 = Arrays.stream(nums);
        s4.forEach(System.out::print);

        IO.println();
        // 5. IntStream.of()
        IntStream s5 = IntStream.of(100, 200, 300);
        s5.forEach(System.out::print);

        IO.println();
        // 6. LongStream.of()
        LongStream s6 = LongStream.of(1000L, 2000L, 3000L);
        s6.forEach(System.out::println);

        IO.println();
        // 7. DoubleStream.of()
        DoubleStream s7 = DoubleStream.of(1.1, 2.2, 3.3);
        s7.forEach(System.out::println);

        IO.println();
        // 8. IntStream.range()
        IntStream s8 = IntStream.range(1, 5);
        s8.forEach(System.out::println);

        IO.println();

        // 9. IntStream.rangeClosed()
        IntStream s9 = IntStream.rangeClosed(1, 5);
        s9.forEach(System.out::println);

    }

}
