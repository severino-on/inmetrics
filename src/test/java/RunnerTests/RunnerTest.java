/**
 * 
 */
package RunnerTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author severino
 *
 */

 @RunWith(Cucumber.class)
 
 @CucumberOptions(features = {"src/Features"}, glue = {"stepDefinition/"})
 
public class RunnerTest {
	
}
