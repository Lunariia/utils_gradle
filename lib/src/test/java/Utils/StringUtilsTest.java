package Utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class StringUtilsTest {

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("10", true),
                Arguments.of("-1", false),
                Arguments.of("0", false)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testisPositiveNumberMethod(String value, boolean expected) {
        //when
        boolean actual = StringUtils.isPositiveNumber(value);
        //then
        Assertions.assertEquals(expected, actual);
    }
}
