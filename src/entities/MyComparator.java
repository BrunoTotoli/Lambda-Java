package entities;

import java.util.Comparator;
import java.util.Locale;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
}
