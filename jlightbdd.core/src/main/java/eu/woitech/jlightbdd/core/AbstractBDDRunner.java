package eu.woitech.jlightbdd.core;

import eu.woitech.jlightbdd.core.results.FeatureResults;

public abstract class AbstractBDDRunner {
    private final TestMetadataProvider testMetadataProvider;
    private final FeatureResultsImpl feature;

    public FeatureResults getResults() {
        return feature;
    }

    protected AbstractBDDRunner(Class<?> featureTestClass,TestMetadataProvider testMetadataProvider){

        this.testMetadataProvider = testMetadataProvider;
        feature=new FeatureResultsImpl(testMetadataProvider.getFeatureName(featureTestClass));
    }

    private static class FeatureResultsImpl implements FeatureResults {
        private String name;

        public FeatureResultsImpl(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
