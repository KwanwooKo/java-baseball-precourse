package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        Computer computer = new Computer();
        Player player = new Player();
        Game game = new Game(computer.getNumber());

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            // player.setNumber => error 발생 시키는 코드
            player.setNumber(Console.readLine());
            game.setPlayer(player.getNumber());



            game.playGame();
        }

    }


}
