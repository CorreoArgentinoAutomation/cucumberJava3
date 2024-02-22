package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class SearchSteps {
    WebDriver driver;
    @Given("the user is in the index page")
    public void userIsInTheIndexPage() throws InterruptedException {
System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
driver = new EdgeDriver();
driver.navigate().to("https://twsec02.correoargentino.com.ar/MiCorreo/public/login");
Thread.sleep(5000);
    };

    @When("the user enters dresses in the search bar")
    public void userEntersDressesInTheSearchBar(){
driver.findElement(By.id("email")).sendKeys("cgoicochea@correoargentino.com.ar");

    };

    @And("the user clicks on the search button")
    public void userClicksOnTheSearchButton(){
        driver.findElement(By.id("password")).sendKeys("Pepino23");
    };

    @Then("the dresses page appears")
    public void dressesPageAppears(){

    };
}
