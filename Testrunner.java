package org.testtag;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Features folder\\Tags.feature",glue="org.testdef",monochrome=true,tags="@smoke",plugin= {"pretty","json:src\\test\\resources\\Jason folder\\report\\output1.json"})
public class Testrunner {
	@AfterClass
	public static void report() {
		Reporting.genReport("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Jason folder\\report\\output1.json");
	}

}
