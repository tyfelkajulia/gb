import ru.gb.MyArrayDataException;
import ru.gb.MyArraySizeException;

public class HomeWorkApp {

    public static void main(String[] args) {
        String[][] arr = {
                {"3", "51", "-80", "1"},
                {"0", "50", "-8", "3"},
                {"2", "-45", "81", "-10"},
                {"0", "54", "3", "21"}
        };

        try {
            System.out.println("Sum: " + sumArr(arr));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if(arr.length != 4){
            throw new MyArraySizeException("wrong array size!");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch(NumberFormatException e){
                    throw new MyArrayDataException("incorrect attay data!");
                }
            }

        }
        return sum;
    }




}



