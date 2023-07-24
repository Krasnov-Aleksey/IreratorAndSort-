package IteratorProba;

import java.util.Comparator;

public class LaptopComparatorByName implements Comparator<Laptop> {


    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

