public class HomeWorkApp {

    public static void main(String[] args) {
        Cat [] catArray = new Cat [3];
        catArray[0] = new Cat("Murzik", 3);
        catArray[1] = new Cat("Barsik", 6);
        catArray[2] = new Cat("Pushok", 5);
        Plate plate = new Plate (8);
        plate.increaseFood(5);
        System.out.println(plate);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat (plate);
            System.out.println(catArray[i]);
        }
        System.out.println(plate);

    }
}

class Cat {
    String name;
    int appetite;
    boolean full;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    void eat (Plate plate) {
        full = plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", full: " + full;
    }
}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    void increaseFood(int food){
        this.food += food;
    }

    boolean decreaseFood (int food) {
        if (this.food - food < 0) {
            return false; // not enough food
        }else{
            this.food -= food;
            return true; // enough food
        }
    }


    @Override
    public String toString() {
        return "Plate: " + food;
    }
}

