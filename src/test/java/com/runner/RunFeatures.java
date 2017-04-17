package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import org.junit.runner.RunWith;

/**
 * Created by John on 4/14/2017.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:test-report"},
        features = {"src/test/resources/"},
        glue = {"com/steps"}
    )
public class RunFeatures {

}
