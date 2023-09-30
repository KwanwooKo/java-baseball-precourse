package baseball;

import java.util.List;

public class Game {

    private final Integer answer = 3;
    private final String answerComment = "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final Integer SIZE = 3;
    private final Integer NOTHING = 0;

    private List<Integer> player;
    private List<Integer> computer;

    public Game(List<Integer> computer) {
        this.computer = computer;
    }

    public void setPlayer(List<Integer> player) {
        this.player = player;
    }

    public boolean isNotFinished() {
        int strike = getStrikeCount();
        int ball = getBallCount();

        if (strike == answer) {
            System.out.println(answerComment);
            return false;
        }

        printStrikeAndBallCount(strike, ball);
        return true;
    }

    private void printStrikeAndBallCount(int strike, int ball) {
        if (strike == NOTHING && ball == NOTHING) {
            System.out.println("낫싱");
            return;
        }
        if (ball == NOTHING) {
            System.out.println(strike + "스트라이크");
            return;
        }
        if (strike == NOTHING) {
            System.out.println(ball + "볼");
            return;
        }
        System.out.println(ball + "볼 " + strike + "스트라이크");
    }


    private int getStrikeCount() {
        int strike = 0;
        for (int i = 0; i < SIZE; i++) {
            strike += isStrike(i);
        }
        return strike;
    }


    private int getBallCount() {
        int ball = 0;
        for (int i = 0; i < SIZE; i++) {
            ball += isBall(i);
        }
        return ball;
    }

    private int isStrike(int index) {
        if (player.get(index).equals(computer.get(index))) {
            return 1;
        }
        return 0;
    }

    private int isBall(int index) {
        for (int i = 0; i < SIZE; i++) {
            if (index == i) {
                continue;
            }
            if (player.get(index).equals(computer.get(i))) {
                return 1;
            }
        }
        return 0;
    }
}
