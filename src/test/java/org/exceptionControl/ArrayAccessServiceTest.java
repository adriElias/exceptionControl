package org.exceptionControl;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayAccessServiceTest {
    private final ArrayAccessService arrayAccessService = new ArrayAccessService();

    @Test
    void should_throw_exception_when_accessing_invalid_position() {
        assertThatThrownBy(() -> arrayAccessService.getElement(5))
                                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    void should_throw_exception_when_accessing_negative_position() {
        assertThatThrownBy(() -> arrayAccessService.getElement(-1))
                                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    void should_return_element_when_position_is_valid() {
        assertThat(arrayAccessService.getElement(1)).isEqualTo(4);
    }
}
