package IteratorProba;

import java.util.Iterator;

public class Laptop{
    private String name;
    private Integer ram;
    private Integer hd;


    public Laptop(String name, Integer ram, Integer hd) {
        this.name = name;
        this.ram = ram;
        this.hd = hd;
    }

    public String getName() {
        return name;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHd() {
        return hd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}
