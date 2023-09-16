package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Steps {
    WebDriver driver = new ChromeDriver();

    @Given("I am in Login page of Bank application")
    public void i_am_in_login_page_of_bank_application() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("I Login with valid credentials")
    public void i_login_with_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("QAtester");
        driver.findElement(By.name("password")).sendKeys("QAtester");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
    }
    @Then("I should be navigated to Home page")
    public void i_should_be_navigated_to_home_page() {
        WebElement WelcomeMessage = driver.findElement(By.className("smallText"));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(WelcomeMessage));
        System.out.println(WelcomeMessage.getText());

    }

}
