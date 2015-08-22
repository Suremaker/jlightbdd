package eu.woitech.jlightbdd.core.helpers;

import org.junit.Assert;

public class AssertThrows {

    @FunctionalInterface
    public interface Runnable {
        void run() throws Throwable;
    }

    public static <TException extends Throwable> TException assertThrows(Class<TException> exceptionClass, Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable e) {
            if (exceptionClass.isInstance(e))
                return (TException) e;

            Assert.fail(String.format("Expected exception of type %s, got %s.", exceptionClass.getName(), e));
        }

        return null;
    }
}
