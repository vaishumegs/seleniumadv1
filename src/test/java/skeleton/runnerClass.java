package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= "C:\\Users\\v.ramiya.surendran\\Documents\\eclipse-workspace\\cucumber_Demo\\src\\test\\resources\\skeleton\\Login.feature",
glue="C:\\Users\\v.ramiya.surendran\\Documents\\eclipse-workspace\\cucumber_Demo\\src\\test\\java\\skeleton\\LoginStepDef.java",
plugin = ("json:target/cucumber-report/CucumberTestReport.json"),
monochrome= true,
dryRun= false	
)                            

public class runnerClass {

}
