public class HomeWorkApp {

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth(13,100);
        minMax();
    }

    public static void first(){
        int [] arr = { 1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.println(arr[i]);
        }
    }


    public static void second(){
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

    }

    public static void third(){
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fourth(){
        int [][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if( i == j ){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void fifth(int len, int initialValue){
        int[] arr = new int[len];
        for (int i=0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

    public static void minMax(){
        int [] arr = {1, -5, 3, -2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = 0, max = 0;
        for (int i=0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min :" + min);
        System.out.println("max :" + max);
    }
}