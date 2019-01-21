package com.company;
import java.util.*;

public class Main {

    final int size = 3;
    char[][] map = new char[size][size];
    final char cNull = '•', player = 'X', cpu1 = 'O', cpu2 = 'W', cpu3 = 'Z';
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public static void main(String[] args) {
        Main g = new Main();
        g.newMap();
        g.printMap();

        while (true) {
            //player turn
            g.playerTurn();
            g.printMap();
            if (g.checkWin(g.player)) { System.out.println("Поздравляю! ты победил"); break; }
            if (g.isMapFull()) { System.out.println("Ничья. Игра окончена"); break; }

            //AI-1 turn
            g.aiTurn(g.cpu1);
            g.printMap();
            if (g.checkWin(g.cpu1)) { System.out.println("Искусственный разум победил. игра окончена\""); break; }
            if (g.isMapFull()) { System.out.println("Ничья. Игра окончена"); break; }

//            Для нескольких игроков
//            AI-2 turn
//            g.aiTurn(g.cpu2);
//            g.printMap();
//            if (g.checkWin(g.cpu2)) { System.out.println("GAME OVER. CPU2 IS THE WINNER"); break; }
//            if (g.isMapFull()) { System.out.println("GAME OVER. NOBODY'S WIN"); break; }
//
//
//            AI-3 turn
//            g.aiTurn(g.cpu3);
//            g.printMap();
//            if (g.checkWin(g.cpu3)) { System.out.println("GAME OVER. CPU3 IS THE WINNER"); break; }
//            if (g.isMapFull()) { System.out.println("GAME OVER. NOBODY'S WIN"); break; }
        }
    }

    void newMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = cNull;
            }
        }
    }

    void printMap() {
        for (int i = 0; i < size + 1; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.print("X");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" " + (i + 1) + "  ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println(i + 1);
        }
        System.out.print(" Y ");
        for (int i = 1; i <= size; i++) System.out.print(i + "  ");
        System.out.println("O\n");
    }

    void playerTurn() {
        int x, y;
        do {
            System.out.println("Ваш ход. Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = player;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= size || y >= size) return false;
        if (map[y][x] == cNull) return true;
        return false;
    }

    boolean checkWin(char c) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= size - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= size - 1; j++) {
                if (map[i][j] == c) {
                    countH++;
                    if (countH == size) return true;
                }

                if (map[j][i] == c) {
                    countV++;
                    if (countV == size) return true;
                }
            }

            if (map[i][i] == c) {
                countDiagonalA++;
                if (countDiagonalA == size) return true;
            } else countDiagonalA = 0;

            if (map[i][size - 1 - i] == c) {
                countDiagonalB++;
                if (countDiagonalB == size) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == cNull) return false;
            }
        }
        return true;
    }

    void aiTurn(char c) {
        int x = 0, y = 0, countH = 0, countHNull = 0, countV = 0, countVNull = 0, countDiagonalA = 0, countDiagonalB = 0, countDANull = 0, countDBNull = 0;

        System.out.println("Ход ИИ [" + c +"]:");

        for (int i = 0; i < size; i++) {
            countH = 0;
            countHNull = 0;
            countV = 0;
            countVNull = 0;
            for (int j = 0; j < size; j++) {
                if (map[j][i] == c) countV++;
                else if (map[j][i] == cNull) countVNull++;
                if ((countV == size - 1) && (countVNull == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[k][i] == cNull) {
                            map[k][i] = c;
                            return;
                        }
                    }
                }
                if (map[i][j] == c) countH++;
                else if (map[i][j] == cNull) countHNull++;
                if ((countH == size - 1) && (countHNull == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[i][k] == cNull) {
                            map[i][k] = c;
                            return;
                        }
                    }
                }

            }

            if (map[i][i] == c) countDiagonalA++;
            else if (map[i][i] == cNull) countDANull++;
            if ((countDiagonalA == size - 1) && (countDANull == 1)) {
                for (int j = 0; j < size; j++) {
                    if (map[j][j] == cNull) {
                        map[j][j] = c;
                        return;
                    }
                }
            }

            if (map[i][size - 1 - i] == c) countDiagonalB++;
            else if (map[i][size - 1 - i] == cNull)  countDBNull++;
            if ((countDiagonalB == size - 1) && (countDBNull == 1)) {
                for (int j = 0; j < size; j++) {
                    if (map[j][size - 1 - j] == cNull) {
                        map[j][size - 1 - j] = c;
                        return;
                    }
                }
            }
        }

        countH = 0;
        countHNull = 0;
        countV = 0;
        countVNull = 0;
        countDiagonalA = 0;
        countDiagonalB = 0;
        countDANull = 0;
        countDBNull = 0;

        for (int i = 0; i < size; i++) {
            countH = 0;
            countHNull = 0;
            countV = 0;
            countVNull = 0;
            for (int j = 0; j < size; j++) {
                if (map[j][i] == player) countV++;
                else if (map[j][i] == cNull) countVNull++;
                if ((countV == size - 1) && (countVNull == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[k][i] == cNull) {
                            map[k][i] = c;
                            return;
                        }
                    }
                }
                if (map[i][j] == player) countH++;
                else if (map[i][j] == cNull) countHNull++;
                if ((countH == size - 1) && (countHNull == 1)) {
                    for (int k = 0; k < size; k++) {
                        if (map[i][k] == cNull) {
                            map[i][k] = c;
                            return;
                        }
                    }
                }

            }

            if (map[i][i] == player) countDiagonalA++;
            else if (map[i][i] == cNull) countDANull++;
            if ((countDiagonalA == size - 1) && (countDANull == 1)) {
                for (int j = 0; j < size; j++) {
                    if (map[j][j] == cNull) {
                        map[j][j] = c;
                        return;
                    }
                }
            }

            if (map[i][size - 1 - i] == player) countDiagonalB++;
            else if (map[i][size - 1 - i] == cNull)  countDBNull++;
            if ((countDiagonalB == size - 1) && (countDBNull == 1)) {
                for (int j = 0; j < size; j++) {
                    if (map[j][size - 1 - j] == cNull) {
                        map[j][size - 1 - j] = c;
                        return;
                    }
                }
            }
        }

        if (!(size % 2 == 0)) {
            int center = (((size + 1) / 2) - 1);
            if (map[center][center] == cNull) {
                map[center][center] = c;
                return;
            }
        }

        if (map[0][0] == cNull) { map[0][0] = c; return; }
        if (map[0][map.length - 1] == cNull) { map[0][map.length - 1] = c; return; }
        if (map[map.length - 1][0] == cNull) { map[map.length - 1][0] = c; return; }
        if (map[map.length - 1][map.length - 1] == cNull) { map[map.length - 1][map.length - 1] = c; return; }

        do {
            x = r.nextInt(size);
            y = r.nextInt(size);
        } while (!isCellValid(x, y));
        map[y][x] = c;
        System.out.println("ИИ X: " + (x + 1) + " Y: " + (y + 1));
    }
}

