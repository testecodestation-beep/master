package Runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",glue = "Steps",tags = "@formularioAberturaContaPJ",plugin = {"pretty",
		"html:target/relatorioBancoInter.html"},monochrome =  true)
public class Runner {

}
