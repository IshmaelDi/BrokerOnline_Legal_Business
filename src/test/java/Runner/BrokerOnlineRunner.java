package Runner;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/BrokerOnline_Legal_Business.feature",
        glue = "stepDefinition",
        dryRun = false,
        tags = "@Test1" )

public class BrokerOnlineRunner {
}
