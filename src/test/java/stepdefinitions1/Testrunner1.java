package stepdefinitions1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/Features/login1.feature"}, glue = {"stepdefinitions1"},
plugin = {})
public class Testrunner1 extends AbstractTestNGCucumberTests {

}
 