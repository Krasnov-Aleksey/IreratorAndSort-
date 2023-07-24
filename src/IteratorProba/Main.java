package IteratorProba;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Samsung",4,128);
        Laptop laptop2 = new Laptop("Lenova",2,256);
        Laptop laptop3 = new Laptop("HP",8,256);

        CompositionLaptop compositionLaptop=new CompositionLaptop();
        compositionLaptop.addLaptop(laptop1);
        compositionLaptop.addLaptop(laptop2);
        compositionLaptop.addLaptop(laptop3);

        for(Laptop laptop:compositionLaptop){
            System.out.println(laptop);
        }
        System.out.println();

        compositionLaptop.sortByName();
        for(Laptop laptop:compositionLaptop){
            System.out.println(laptop);
        }
        System.out.println();
        compositionLaptop.sortByRam();
        for (Laptop laptop:compositionLaptop){
            System.out.println(laptop);
        }

    }
}
