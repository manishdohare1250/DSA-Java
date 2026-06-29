package _15_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _07_combine_2_arraylist_eleemnts_into_a_single_arraylist {
    /**
    * 
    */
    void main() {
        List<String> l1 = Arrays.asList("Rohit", "virat", "Shreyas", "vaibhav", "yashsawi");
        List<String> l2 = Arrays.asList("AbD", "miller", "classsen", "decock", "rabada");

        List<String> combined = Stream.of(l1, l2)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Combined list is:" + combined);
    }

}
