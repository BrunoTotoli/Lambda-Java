package Aula03.program;

import Aula03.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
//        list.forEach(product -> product.setPrice((product.getPrice() * 1.1)));
//        list.forEach(System.out::println);

        //Aula 04
        List<String> names = list.stream()
                .map(product -> product.getName().toUpperCase())
                .toList();
//        names.forEach(System.out::println);
        //Aula 05
        Stream<Product> streamProductInitialT = list.stream().filter(product -> product.getName().charAt(0) == 'T');
        Double streamSumPrice = streamProductInitialT.map(Product::getPrice).reduce(0.0, Double::sum);
        System.out.println(streamSumPrice);


    }
}
