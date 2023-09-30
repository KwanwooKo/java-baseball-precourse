package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.List;


class PlayerTest {

    Player player = new Player();

    @BeforeEach
    public void beforeEach() {
//        player.initialize();
    }

    /**
     * 예외가 발생하지 않는 상황
     * 중복되는 숫자 입력하지 않음
     * 길이도 정확히 3
     */
    @Test
    @DisplayName("예외가 발생하지 않는 상황")
    public void testGeneralCase() throws Exception {
        // given
        String input = "123";
        // when
        player.setNumber(input);
        // then
        Assertions.assertThat(player.getNumber()).size().isEqualTo(3);
    }

    /**
     * 길이가 3이 아닌 경우
     * 예외가 정상적으로 발생하는지 확인
     */
    @Test
    @DisplayName("길이가 3이 아닌 경우")
    public void generateLengthError() throws Exception {
        // given
        String input = "1234";
        // then
        Assertions.assertThatThrownBy(() -> player.setNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    /**
     * 중복값을 넣는 경우
     * 예외가 정상적으로 발생하는지 확인
     */
    @Test
    @DisplayName("중복값을 넣는 경우")
    public void generateDuplicateValueError() throws Exception {
        // given
        String input = "877";
        Assertions.assertThatThrownBy(() -> player.setNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }


}