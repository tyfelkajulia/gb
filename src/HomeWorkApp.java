import ru.gb.Apple;
import ru.gb.Box;
import ru.gb.Fruit;
import ru.gb.Orange;

public class HomeWorkApp {

    public static void main(String[] args) {
        Fruit orange = new Orange("апельсин сибирский", 20);
        Fruit orange2 = new Orange("мандарин сибирский", 10);
        Fruit orange3 = new Orange("апельсин сибирский", 40);
        Fruit apple = new Apple("белый налив", 15);

        Box orangeBox = new Box(100, orange);
        Box mandarinBox = new Box(30, orange2);
        Box orangeBox2 = new Box(30, orange3);
        Box appleBox = new Box(80, apple);

        System.out.println("Weight orange box: " + orangeBox.getWeight());
        System.out.println("Weight apple box: " + appleBox.getWeight());

        orangeBox.add(appleBox);
        orangeBox.add(mandarinBox);
        orangeBox.add(orangeBox2);
        System.out.println("Weight orange box: " + orangeBox.getWeight());

    }


}



