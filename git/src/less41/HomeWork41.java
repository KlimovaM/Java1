package less41;

import java.util.Random;
import java.util.Scanner;

public class HomeWork41 {

    public static int size = 5;
    public static int dots_to_wins = 4;
    public static final char dot_empty = '*';
    public static final char dot_x = 'X';
    public static final char dot_o = 'O';
    public static char[][] map;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(dot_x)) {
                System.out.println("Human win!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(dot_o)) {
                System.out.println("AI win!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }
        }
        System.out.println("Game over");
    }

    public static void initMap() { // инициализация поля
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }
    public static void printMap() { // печать поля
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void humanTurn() {  // ход человека
        int x, y;
        do {
            System.out.println("Вести координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = dot_x;
    }

    public static void aiTurn() {  // ход машины
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютера X Y " + (x + 1) + " " + (y + 1));
        map[x][y] = dot_o;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[x][y] == dot_empty) return true;
        return false;
    }
    // проверка на победу, запуталась, интернет не спас :(
    public static boolean checkWin(char win) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (checkLine(i, j, 1, 0, dots_to_wins, win)) {
                    return true;    // проверка по линии
                }
                if (checkLine(i, j, 1, 1, dots_to_wins, win)) {
                    return true;    // проверка по диагонали
                }
                if (checkLine(i, j, 0, 1, dots_to_wins, win)) {
                    return true;	// проверка по линии
                }
                if (checkLine(i, j, 1, -1, dots_to_wins, win)) {
                    return true;	// проверка по диагонали
                }
            }
        }
        return false;
    }

    // проверка линии
    public static boolean checkLine(int x, int y, int vx, int vy, int len, char c) {
        final int farX = x + (len - 1) * vx;
        final int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vy][x + i * vx] != c) {
                return false;	// проверим одинаковые-ли символы в ячейках
            }
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }


/* // Здесь работает, но это конечно же не то, чего хотелось бы :(
    public static boolean checkWin(char win) {
        if(map[0][0] == win && map[0][1] == win && map[0][2] == win && map[0][3] == win) return true;
        if(map[1][0] == win && map[1][1] == win && map[1][2] == win && map[1][3] == win) return true;
        if (map[2][0] == win && map[2][1] == win && map[2][2] == win && map[2][3] == win) return true;
        if (map[3][0] == win && map[3][1] == win && map[3][2] == win && map[3][3] == win) return true;

        if (map[0][0] == win && map[1][0] == win && map[2][0] == win && map[3][0] == win) return true;
        if (map[0][1] == win && map[1][1] == win && map[2][1] == win && map[3][1] == win) return true;
        if (map[0][2] == win && map[1][2] == win && map[2][2] == win && map[3][2] == win) return true;
        if (map[0][3] == win && map[1][3] == win && map[2][3] == win && map[3][3] == win) return true;

        if (map[0][0] == win && map[1][1] == win && map[2][2] == win && map[3][3] == win) return true;
        if (map[0][1] == win && map[1][2] == win && map[2][3] == win && map[3][4] == win) return true;
        if (map[1][0] == win && map[2][1] == win && map[3][2] == win && map[4][3] == win) return true;

        if (map[4][0] == win && map[3][1] == win && map[2][2] == win && map[1][3] == win) return true;
        if (map[4][1] == win && map[3][2] == win && map[2][3] == win && map[1][4] == win) return true;
        if (map[3][0] == win && map[2][1] == win && map[1][2] == win && map[0][3] == win) return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) return false;
            }
        }
        return true;
    }

 */

/*2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
например, с использованием циклов.
 */





}
