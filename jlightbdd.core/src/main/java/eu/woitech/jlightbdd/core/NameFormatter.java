package eu.woitech.jlightbdd.core;

import java.util.Objects;

public class NameFormatter {
    public static String format(String name) {
        return Objects.requireNonNull(name, "Name parameter cannot be null")
                .replace('_', ' ');
    }
}
