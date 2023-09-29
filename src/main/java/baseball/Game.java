package baseball;

import java.util.List;

public class Game {

    private List<Integer> player;
    private List<Integer> computer;

    public Game(List<Integer> computer) {
        this.computer = computer;
    }

    public void setPlayer(List<Integer> player) {
        this.player = player;
    }

    public void playGame() {

    }
}
