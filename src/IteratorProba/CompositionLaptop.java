package IteratorProba;

import java.util.*;

public class CompositionLaptop implements Iterable<Laptop> {
    private List<Laptop> laptopList;
    public CompositionLaptop(){
        laptopList=new ArrayList<>();
    }
    public void addLaptop(Laptop laptop){
        laptopList.add(laptop);
    }
    public List getInfo(){
        return laptopList;
    }

    @Override
    public Iterator<Laptop> iterator() {
        return new LaptopIterator(laptopList);
    }

    public void sortByName() {
        Collections.sort(laptopList, new LaptopComparatorByName());
    }
    public void sortByRam(){
        Collections.sort(laptopList,new LaptopComparatorByRam());
    }

}
