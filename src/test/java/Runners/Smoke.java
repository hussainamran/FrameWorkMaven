package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature we use to provide the path of all the feature file
        features = "src/test/resources/features",
        //glue is where we find implementations for gherkins steps
        //we provide the path of package where we defined all the steps
        glue = "steps",
        //if we set it to true, it will quickly scan all gherkin steps wheather they are implemented or not
        //if it is set to true, it stops actual execution
        //to execute script it should be set to false
        dryRun = false,
        //it means the console output for cucumber test is having some irrelevant information
        //when we set it to true it simply remove all the irrelevant information from the console
        monochrome = true,

        tags="@dashboard",
        plugin = {"pretty","html:target/cucumber.html"}

)
public class Smoke {
}
