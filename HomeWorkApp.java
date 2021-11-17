import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = ' ';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new HomeWorkApp().game();
    }

    HomeWorkApp() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YUO WON");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("YOU OVER");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry DRAW");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn x y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean checkWin(char ch) {
        int countX = 0;
        int countY = 0;
        int countXY1 = 0;
        int countXY2 = 0;
        for (int i =0; i < 3 ; i++) {
            countX = 0;
            countY = 0;
            for (int j = 0; j < 3; j++) {
                countX += table[i][j] == ch ? 1 : 0;
                countY += table[j][i] == ch ? 1 : 0;
                countXY1 += i == j && table[i][j] == ch ? 1 : 0;
                countXY2 += j == 2-i && table[i][j] == ch ? 1 : 0;
            }
            if(countX == 3 || countY == 3 || countXY1 == 3 || countXY2 == 3){
                return true;
            }
        }
        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i =0; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}