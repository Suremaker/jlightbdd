package eu.woitech.jlightbdd.core;

public abstract class TestMetadataProvider {
    public String getFeatureName(Class<?> featureTestClass) {
        return NameFormatter.format(featureTestClass.getSimpleName());
    }
}
