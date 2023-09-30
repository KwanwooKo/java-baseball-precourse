package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        Computer computer = new Computer();
        Player player = new Player();
        Game game = new Game(computer.getNumber());

//        computer.printNumber();

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");

            player.setNumber(Console.readLine());
            game.setPlayer(player.getNumber());
            if (game.isNotFinished()) {
                continue;
            }

            // 다시 시작하는 로직 구현해야돼
            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            if (Console.readLine().equals("2")) {
                break;
            }
            computer.resetComputerNumber();
//            computer.printNumber();
        }
    }


}
