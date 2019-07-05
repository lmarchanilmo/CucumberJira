package com.jira.integration

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ["classpath:features/"]
        , monochrome = true
        , format = ["pretty", "json:target/cucumber.json", "rerun:rerun.txt", "junit:target/cucumber.xml"]
        , glue = ["src/test/groovy/com/jira/integration/steps"]
        //, tags = ["~@smokeProd"]
)
class RunCucumberITCase {
}
