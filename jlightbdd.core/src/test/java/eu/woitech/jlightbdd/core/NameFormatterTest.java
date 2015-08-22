package eu.woitech.jlightbdd.core;

import eu.woitech.jlightbdd.core.helpers.AssertThrows;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class NameFormatterTest {
    @Test
    public void formatter_should_replace_underscores_to_spaces() {
        Assert.assertThat(NameFormatter.format("some_function_name"), is("some function name"));
    }

    @Test
    public void formatter_should_throw_exception_if_parameter_is_null() {
        NullPointerException exception = AssertThrows.assertThrows(NullPointerException.class, () -> NameFormatter.format(null));
        Assert.assertThat(exception.getMessage(), is("Name parameter cannot be null"));
    }
}


