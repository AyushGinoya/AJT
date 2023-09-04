package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ayush","Aayushi","Deep","Raj","Dipti","Yagnik","Shruti");

        Stream<String> stringStream = list.stream();

        stringStream.forEach(e -> System.out.println(e));
        System.out.println();

        IntStream.range(1,99).forEach(e->System.out.println(e));
        System.out.println();

        Arrays.stream(new int[] {11,22,33,44,55}).average().ifPresent(avg -> System.out.println(avg));
    }
}
