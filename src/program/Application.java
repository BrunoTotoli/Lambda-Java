package program;

import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Comparator<Product> comparator = (p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());


        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


        list.sort(comparator);

        for (Product p : list) {
            System.out.println(p);
        }
    }

    //Classe Anonima
//    Comparator<Product> comparator = new Comparator<Product>() {
//        @Override
//        public int compare(Product o1, Product o2) {
//            return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
//        }
//    };
    //Funcao Anonima  //Arrow Function
//     Comparator<Product> comparator = (p1, p2) -> {
//         return p1.getName().toLowerCase(Locale.ROOT).compareTo(p2.getName().toLowerCase(Locale.ROOT));
//     };


}
