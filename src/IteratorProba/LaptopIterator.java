package IteratorProba;

import java.util.Iterator;
import java.util.List;

public class LaptopIterator implements Iterator<Laptop> {
    private int index;
    List<Laptop> laptopList;

    public LaptopIterator(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    @Override
    public boolean hasNext() {
        return laptopList.size()>index;
    }

    @Override
    public Laptop next() {
        return laptopList.get(index++);
    }

}
