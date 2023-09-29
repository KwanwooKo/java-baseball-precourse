package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> number = new ArrayList<>();
    private boolean[] checkNumber = new boolean[10];
    public Computer() {
        pickUniqueNumbersInRange();
    }

    private void pickUniqueNumbersInRange() {
        while (number.size() != 3) {
            Integer num = Randoms.pickNumberInRange(1, 9);
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

    public List<Integer> getNumber() {
        return this.number;
    }

}
