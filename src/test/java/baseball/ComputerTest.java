package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    Computer computer = new Computer();

    @Test
    public void printNumberList() throws Exception {
        // given
        List<Integer> randomNumberList = computer.getNumber();
        // when
        for (Integer integer : randomNumberList) {
            System.out.println("integer = " + integer);
        }
        // then
        assertThat(randomNumberList).size().isEqualTo(3);
    }

}