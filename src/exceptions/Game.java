package exceptions;

import java.util.Arrays;

public class Game {

    private final int SIZE = 3;
    private final char EMPTY = '▢';
    private final char PX = '✘';
    private final char PO = '◉';

    public enum PLAYER {
        P1,
        P2
    }

    char[][] map = new char[SIZE][SIZE];

    public Game() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public void draw(PLAYER player, int i, int j) throws GameException {
        if (i >= SIZE  ||  j  >= SIZE  ||  i < 0  ||  j < 0) {
            throw new GameException("Map - out of bounds");
        }
        if (map[i][j] != EMPTY) {
            throw new GameException("Map - already selected");
        }

        char ch = player == PLAYER.P1 ? PX : PO;
        map[i][j] = ch;
    }

    public void print() {
        System.out.println(this);
    }

    public boolean isDone() {
        int[][] wins = new int[][]{
                {00, 01, 02},
                {10, 11, 12},
                {20, 21, 22},
                {00, 10, 20},
                {01, 11, 21},
                {02, 12, 22},
                {00, 11, 22},
                {02, 11, 20},
        };


        int count = 0;
        for (int i = 0; i < wins.length; i++) {
            for (int j = 0; j < wins[0].length; j++) {
                int x = wins[i][j] / 10;
                int y = wins[i][j] % 10;
                if (map[x][y] == PX) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
            count = 0;
        }

        count = 0;
        for (int i = 0; i < wins.length; i++) {
            for (int j = 0; j < wins[0].length; j++) {
                int x = wins[i][j] / 10;
                int y = wins[i][j] % 10;
                if (map[x][y] == PO) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
            count = 0;
        }



        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String str = "\n";
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                str += map[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    class GameException extends Exception {

        public GameException(String message) {
            super(message);
        }
    }
}
