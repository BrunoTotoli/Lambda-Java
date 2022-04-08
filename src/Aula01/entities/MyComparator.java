package Aula01.entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
}
