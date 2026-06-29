package _16_Optional_class;

import java.util.Collections;
import java.util.Optional;

public class _01_basic_optional_container {

    void main() {
        String fruitName=null;

        Optional<String> container = Optional.ofNullable(fruitName);

      //  IO.println(container.get().toString());//.....it is generating the exception if nothing inside the container

        // if (container.isPresent()) {
        //     IO.println("You have provided fruitName:" + container.get().toString());
        // } else {
        //     IO.println("YOU have not provideed any name, null is passed");
        // }

        System.out.println(container.orElse("Mango"));
      Collections
    }
}
