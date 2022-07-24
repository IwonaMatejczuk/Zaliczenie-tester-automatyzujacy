package ZaliczenieZadanie1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith (Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/ZaliczenieZadanie1.feature",
        plugin = {"pretty","html:out"})

public class ZaliczenieZadanie1Cucumber {
}
