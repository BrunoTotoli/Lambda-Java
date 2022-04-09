package Aula06.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);

        Stream<Integer> integerStream = list.stream().map(x -> x * 10);
//        System.out.println(Arrays.toString(integerStream.toArray()));

        Stream<String> stringStream = Stream.of("Jairo", "Cleito", "Furduncio");
//        System.out.println(Arrays.toString(stringStream.toArray()));

        Stream<Integer> iterateStream = Stream.iterate(0, x -> x + 2);
//        System.out.println(Arrays.toString(iterateStream.limit(10).toArray()));

        Stream<Long> fibonacciSequenceStream = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
//        System.out.println(Arrays.toString(fibonacciSequenceStream.limit(10).toArray()));

        //Aula 07

        Stream<Integer> st1 = list.stream()
                .map(x -> x * 10);
        st1.forEach(System.out::println);

        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<Integer> st2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10).toList();
        st2.forEach(System.out::println);


    }
}
