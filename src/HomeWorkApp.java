public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println( within10and20(5,10) );
        posneg(-7);
        System.out.println( negat(-9) );
        printWorldTimes("cat", 5);
    }

    static boolean within10and20(int a, int b){
        int sum = a + b;
        if(sum > 10 && sum < 20){
            return true;
        }
        return false;
    }
    static void posneg (int a){
        if (a >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    static boolean negat (int a) {
        if (a <= 0) {
            return true;
        }
        return false;
    }
    static void printWorldTimes (String world, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(world);
        }
    }
}