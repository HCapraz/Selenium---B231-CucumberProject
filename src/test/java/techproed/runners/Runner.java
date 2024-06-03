package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//cucumber ile junitin entegre olmasini saglayarak scenariolarimizi calistirmaya yarar
@CucumberOptions(//bu notasyon sayesinde hangi scnariolari calistiracağımizi ve hangi raporlari alacağımızı ayarlariz
        features = "src/test/resources/features",
        glue = "techproed/stepDefinitions",
        tags = "@US004",
        dryRun = false
)
public class Runner {
}
/*
      dryRun parametresi eger true secilirse scenariolari calistirmadan feature file daki steplerin
       eksik stepDefinitioni olup olmadigini kontrol eder, (browseri calistirmaz)
 */
