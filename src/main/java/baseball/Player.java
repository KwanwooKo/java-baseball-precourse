package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Integer> number = new ArrayList<>();
    private final boolean[] checkNumber = new boolean[10];

    public Player() {
    }

    private void validateNumber() {
        if (number == null) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 중복된 값이 들어왔는지 확인
     */
    private void validateDuplicate(Integer num) {
        if (checkNumber[num]) {
            throw new IllegalArgumentException();
        }
        checkNumber[num] = true;
    }

    /**
     * input 길이가 3인지 확인
     */
    private void validateInputRange(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void initCheckNumber() {
        for (int i = 0; i < 10; i++) {
            checkNumber[i] = false;
        }
    }

    public void initialize() {
        number.clear();
        initCheckNumber();
    }

    public void setNumber(String input) {
        validateInputRange(input);
        for (int i = 0; i < input.length(); i++) {
            Integer num = input.charAt(i) - '0';
            number.add(num);
            validateDuplicate(num);
        }
        validateNumber();
    }

    public List<Integer> getNumber() {
        return number;
    }
}
