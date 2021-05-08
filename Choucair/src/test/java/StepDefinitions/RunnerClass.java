package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\julia\\IdeaProjects\\Choucair\\src\\test\\resources\\tablaBuscarEmpleos.feature", glue= {"StepDefinitions"}
        ,monochrome = true,plugin={"pretty", "html:target\\HtmlReportTablaBuscarEmpleos"})

public class RunnerClass {
}
