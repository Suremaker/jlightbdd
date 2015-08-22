package eu.woitech.jlightbdd.core;

import eu.woitech.jlightbdd.core.samples.Some_feature_class;
import eu.woitech.jlightbdd.core.testable.TestableTestMetadataProvider;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TestMetadataProviderTest {

    private TestableTestMetadataProvider metadataProvider = new TestableTestMetadataProvider();

    @Test
    public void provider_should_retrieve_feature_name() {

        Assert.assertThat(
                metadataProvider.getFeatureName(Some_feature_class.class),
                is("Some feature class"));
    }
}