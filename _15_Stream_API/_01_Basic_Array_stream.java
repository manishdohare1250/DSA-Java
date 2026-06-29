package _15_Stream_API;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _01_Basic_Array_stream {

        public static void main(String[] args) {

                // --------------------------,without storing into stream ,direct convert array
                // into stream and direct operations-------------------------------
                IO.println("---------Without stroing into stream----------");
                IO.println();
                Integer[] arr = { 1, 2, 3, 4, 5 };

                // 1. Stream.of(elements)
                System.out.print("1. Stream.of(1,2,3,4,5)----->  ");
                Stream.of(1, 2, 3, 4, 5)
                                .forEach(num -> System.out.print(num + " "));

                System.out.println("\n");
                // 2. Stream.of(array)
                System.out.print("2.Stream.of(array)----->  ");
                Stream.of(arr)
                                .forEach(num -> System.out.print(num + " "));

                System.out.println("\n");

                IO.print("By Intstream.of(50,50,40,30,30)---->");
                IntStream.of(50, 50, 40, 30, 30)
                                .forEach(num -> System.out.print(num + " "));
                IO.println();
                IO.println();
                // 3. Arrays.stream(array)
                System.out.print("3.Arrays.stream(array)----->  ");
                Arrays.stream(arr)
                                .forEach(num -> System.out.print(num + " "));

                System.out.println("\n");

                // 4. Arrays.stream(new Array with elemtns)
                System.out.print("4.Arrays.stream(new Integer[]{1,2,3,4,5})----->  ");
                Arrays.stream(new Integer[] { 1, 2, 3, 4, 5 })
                                .forEach(num -> System.out.print(num + " "));

                // --------------------------,By storing into stream , Stream<Integer>,then
                // performing operations-------------------------------

                Integer[] arr1 = { 1, 2, 3, 4, 5 };
                int[] nums = { 10, 20, 30, 40, 50 };
                IO.println();
                IO.println();
                IO.println();
                IO.println("----------------By storing into ,Stream<Integer>  --------------");
                // 1. Stream.of(elements)
                IO.println();
                IO.print("1.Stream.of(1,2,3,4,5)------>  ");
                Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
                s1.forEach(num -> System.out.print(num + " "));
                // s1.forEach(System.out::print);

                IO.println();
                IO.println();
                // 2. Stream.of(array)

                IO.print("2.Stream.of(array)---->  ");
                Stream<Integer> s2 = Stream.of(arr1);
                s2.forEach(num -> System.out.print(num + " "));
                // s2.forEach(System.out::print);

                IO.println();
                // 3. Arrays.stream(Array)
                IO.println();
                IO.print("3. Arrays.stream(Array)------>  ");
                Stream<Integer> s3 = Arrays.stream(arr1);
                s3.forEach(num -> System.out.print(num + " "));
                // s3.forEach(System.out::print);

                // 4. Arrays.stream(new Array with elemtns)
                IO.println();
                IO.println();
                System.out.print("4.Arrays.stream(new Integer[]{1,2,3,4,5})---->  ");
                Stream<Integer> st = Arrays.stream(new Integer[] { 1, 2, 3, 4, 5 });
                st.forEach(num -> System.out.print(num + " "));
                // st.forEach(System.out::print);

                // --------------------------,By storing into stream , IntStream and other,then
                // performing operations-------------------------------
                IO.println();
                IO.println();

                IO.println("-------------By Storing into IntStream,DoubleSteam,LongStream--------------");
                // 1. Arrays.stream(int[])
                IO.print("1. Arrays.stream(Array)------>  ");
                IntStream s4 = Arrays.stream(nums);
                s4.forEach(num -> System.out.print(num + " "));

                IO.println();
                IO.println();

                // 2. IntStream.of()
                IO.print("2. IntStream.of(100,200,300)------>  ");
                IntStream s5 = IntStream.of(100, 200, 300);
                s5.forEach(num -> System.out.print(num + " "));

                IO.println();
                IO.println();
                // 6. LongStream.of()

                IO.print("3. LongStream.of(1000L,2000L,3000L)------>  ");
                LongStream s6 = LongStream.of(1000L, 2000L, 3000L);
                s6.forEach(num -> System.out.print(num + " "));
                IO.println();
                IO.println();
                // 7. DoubleStream.of()
                IO.print("3. DoubleStream.of(1.1, 2.2, 3.3)------>  ");
                DoubleStream s7 = DoubleStream.of(1.1, 2.2, 3.3);
                s7.forEach(num -> System.out.print(num + " "));

                IO.println();
                IO.println();
                // 8. IntStream.range()
                IO.println("IntStream.range:----->");
                IntStream s8 = IntStream.range(1, 5);
                s8.forEach(num -> System.out.print(num + " "));

                IO.println();
                IO.println();

                // 9. IntStream.rangeClosed()
                IO.println("IntStream.rangeClosed:----->");
                IntStream s9 = IntStream.rangeClosed(1, 5);
                s9.forEach(num -> System.out.print(num + " "));

        }

}
