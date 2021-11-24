public class HomeWorkApp {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Murka", "white", 3);
        animals[1] = new Dog("Sharik", "black", 10);
        animals[2] = new Dog("Tuzik", "brown", 4);
        for(int i=0; i < animals.length; i++){
            animals[i].run(300);
            animals[i].swim(100);
        }
        System.out.println("total created: " + Animal.count);
    }

}

interface IAnimal{
    void run(int distance);
    void swim(int distance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    public static int count = 0;

    Animal (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
class Cat extends Animal {
    private static int runLimit = 200;
    private static int swimLimit = 0;

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        distance = Math.min(distance, runLimit);
        System.out.println(name + " run " + distance);
    }

    @Override
    public void swim(int distance) {
        distance = Math.min(distance, swimLimit);
        System.out.println(name + " swim " + distance);
    }
}

class Dog extends Animal {
    private static int runLimit = 500;
    private static int swimLimit = 10;

    Dog (String name, String color, int age) {
        super (name, color, age);
    }

    @Override
    public void run(int distance) {
        distance = Math.min(distance, runLimit);
        System.out.println(name + " run " + distance);
    }

    @Override
    public void swim(int distance) {
        distance = Math.min(distance, swimLimit);
        System.out.println(name + " swim " + distance);
    }
}


