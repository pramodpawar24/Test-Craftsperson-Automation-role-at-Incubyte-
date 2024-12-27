package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".\\src\\test\\resources\\Features\\CreateAccountFeature.feature",
				".\\src\\test\\resources\\Features\\SignInFeature.feature"},
		
		glue={"StepDefination"},
//		dryRun=false,
//		monochrome=true,
	    plugin= {"pretty" , "junit:target/CucumberReports/reports1-xml.xml",
	    		             "html:target/CucumberReports/reports1.html",
	    		             "json:target/CucumberReports/reports1_json.json"}
		
		)
public class TestRunner {
	

}
