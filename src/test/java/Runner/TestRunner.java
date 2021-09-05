package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature"},
        glue = {"Steps"},plugin ={"pretty","html:target/HtmlReports"},
        dryRun=false)
public class   TestRunner {
}
