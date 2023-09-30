package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final Integer RANDOM_START = 1;
    private final Integer RANDOM_END = 9;

    private List<Integer> number = new ArrayList<>();
    private boolean[] checkNumber = new boolean[10];
    public Computer() {
        addUniqueNumbersInRange();
    }

    private void addUniqueNumbersInRange() {
        while (number.size() != 3) {
            Integer num = Randoms.pickNumberInRange(RANDOM_START, RANDOM_END);
            addNumber(num);
        }
    }

    private void addNumber(Integer num) {
        if (validateDuplicate(num)) {
            return;
        }
        checkNumber[num] = true;
        number.add(num);
    }

    boolean validateDuplicate(Integer num) {
        return checkNumber[num];
    }

    public void printNumber() {
        for (Integer integer : number) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public List<Integer> getNumber() {
        return this.number;
    }

    public void resetComputerNumber() {
        initialize();
        addUniqueNumbersInRange();
    }


    private void initialize() {
        number.clear();
        for (int i = 0; i < 10; i++) {
            checkNumber[i] = false;
        }
    }
}
