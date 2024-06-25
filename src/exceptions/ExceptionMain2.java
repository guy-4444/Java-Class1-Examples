package exceptions;

import shapes.Circle;

import java.util.ArrayList;
import java.util.Random;

import static exceptions.Game.PLAYER.P1;
import static exceptions.Game.PLAYER.P2;

public class ExceptionMain2 {

    public static void start() {
        Game game = new Game();

        int player = 0;
        while (!game.isDone()) {
            Game.PLAYER P = player == 0 ? P1 : P2;
            try {
                int i = new Random().nextInt(3);
                int j = new Random().nextInt(3);
                game.draw(P, i, j);
                player = 1 - player;
            } catch (Game.GameException e) { }
        }

        game.print();


    }


}
