package eu.woitech.jlightbdd.core.testable;

import eu.woitech.jlightbdd.core.AbstractBDDRunner;
import eu.woitech.jlightbdd.core.TestMetadataProvider;

public class TestableBDDRunner extends AbstractBDDRunner {

    public TestableBDDRunner(Class<?> featureTestClass, TestMetadataProvider testMetadataProvider) {
        super(featureTestClass, testMetadataProvider);
    }

    public TestableBDDRunner(Class<?> featureTestClass) {
        this(featureTestClass, new TestableTestMetadataProvider());
    }
}
