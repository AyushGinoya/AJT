package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 22, 34, 56, 778, 99, 43, 222, 21);

        // Convert the list into a stream
        Stream<Integer> stream = list.stream();

        // Use filter to keep only odd numbers
        List<Integer> list1 = stream.filter(i -> i % 2 != 0).collect(Collectors.toList());

        // Print the filtered list
        System.out.println(list1);

//        List<Integer> list2 = stream.filter(i -> i > 22).collect(Collectors.toList());
//
//        // Print the filtered list
//        System.out.println(list2);
    }
}
