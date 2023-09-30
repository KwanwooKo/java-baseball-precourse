package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.List;

public class Computer {
    private List<Integer> number;

    public Computer() {
        try {
            this.number = Randoms.pickUniqueNumbersInRange(0, 9, 3);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getNumber() {
        return this.number;
    }

}
