package ru.gb;

import java.util.Comparator;

public class Box implements Comparator {

    private int count;
    private Fruit fruit;

    public Box(int count, Fruit fruit) {
        this.count = count;
        this.fruit = fruit;
    }

    public int getWeight(){
        return getFruit().getWeight() * getCount();
    }

    public boolean add(Box addFrom){
        if(!this.getFruit().getName().equals(addFrom.getFruit().getName())){
            System.out.println("cannot pour another type of fruits into this box to avoid nix... ");
            return false;
        }
        this.setCount( this.getCount() + addFrom.getCount() );
        addFrom.setCount(0);

        System.out.println("sucessfully add fruits from to the box: " + this);
        return true;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Fruit fr1 = (Fruit) o1;
        Fruit fr2 = (Fruit) o2;
        return fr1.getWeight() - fr2.getWeight();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Box{" +
                "count=" + count +
                ", fruit=" + fruit +
                '}';
    }
}
