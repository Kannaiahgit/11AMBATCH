package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\kanna\\eclipse-workspace\\11AMBATCH\\Features",
		//features= ".//Feature//GuruLogin1.feature",
		glue= {"StepDefinitions"},
		plugin= {"pretty",
				"html:reports/myreports.html",
				"html:reports/myreports.json",
				//"rerun:target/rerun.txt",
		},
		dryRun=false,
		monochrome=true,
		tags="@Sanity"
		)



public class testrunner {

}
