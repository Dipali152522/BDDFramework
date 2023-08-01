import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
                , features = "src/test/java/features"
                , glue = {"browserControl", "stepDefinitions"}
                ,tags = "@SmokeTest")

public class TestRunner {

}
