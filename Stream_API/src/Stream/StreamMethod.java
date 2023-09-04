package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {

        //filter

        List<String> list = Arrays.asList("Ayush","Aayushi","Deep","Raj","Dipti","Yagnik","Shruti");

        Stream<String> stream = list.stream();

        //e.startsWith("A")

        List<String> list1 = list.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println();


        //map

        List<Integer> list2 = Arrays.asList(1, 22, 34, 56, 778, 99, 43, 222, 21);
        Stream<Integer> stream1 = list2.stream();
        List<Integer> list3 = list2.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println();


        //Sorted

        list2.stream().forEach(System.out::println);
        System.out.println();


        //min

        Integer i = list2.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min="+i);
        System.out.println();


        //max

        Integer j = list2.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("max=" + j);
        System.out.println();


        //findFirst

        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println();


        //sum

        int sum = list2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println();


        //Transfer into IntStream

        Stream.of("101","123","155","143").mapToInt(Integer::parseInt).min().ifPresent(System.out::println);
        System.out.println();


        //Intermediate operations are lazy.
        //They are execute only if terminal operations are present.

        list.stream().filter(e->{
            System.out.println(e);
                    return true;
        });

        //no output b'coz terminal operations are missing.

//        list.stream().map(e -> {
//            System.out.println("map() on " + e);
//            return e.toUpperCase();
//        }).filter(e->{
//            System.out.println("Filter() on "+e);
//            return e.startsWith("A");
//        }).forEach(s -> {
//            System.out.println("forEach() on "+s);
//        });

        //There is some problem in this. Run it.

        list.stream().filter(e->{
            System.out.println("Filter() on "+e);
            return e.startsWith("A");
        }).map(e -> {
            System.out.println("map() on " + e);
            return e.toUpperCase();
        }).forEach(s -> {
            System.out.println("forEach() on "+s);
        });
    }
}
