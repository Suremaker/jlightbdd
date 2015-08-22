package eu.woitech.jlightbdd.core;


import eu.woitech.jlightbdd.core.results.FeatureResults;
import eu.woitech.jlightbdd.core.samples.Some_feature_class;
import eu.woitech.jlightbdd.core.testable.TestableBDDRunner;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;

public class AbstractBDDRunnerTest {

    @Test
    public void runner_should_collect_feature_details() {
        FeatureResults results = new TestableBDDRunner(Some_feature_class.class).getResults();
        Assert.assertThat("Results object is null", results, notNullValue());
        Assert.assertThat(results.getName(), is("Some feature class"));
    }
}