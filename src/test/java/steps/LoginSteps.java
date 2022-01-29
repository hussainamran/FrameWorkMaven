package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
    }

    @When("user enter valid admin username and password")
    public void user_enter_valid_admin_username_and_password() {

       // LoginPage loginPage=new LoginPage();
        //loginPage.usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(loginPage.usernameField,ConfigReader.getPropertyValue("username"));
        //WebElement username = driver.findElement(By.id("txtUsername"));
        //username.sendKeys(ConfigReader.getPropertyValue("username"));
       // WebElement password = driver.findElement(By.id("txtPassword"));
       // password.sendKeys(ConfigReader.getPropertyValue("password"));
       // loginPage.passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
        sendText(loginPage.passwordField, ConfigReader.getPropertyValue("password"));
    }

    @When("user click on login button")
    public void user_clicks_on_login_button() {
        //LoginPage loginPage=new LoginPage();
       // WebElement loginButton = driver.findElement(By.id("btnLogin"));
       // loginButton.click();
        loginPage.loginButton.click();
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("hello");
    }

    @Then("user close the browser")
    public void user_close_the_browser() {
        closeBrowser();
    }

    @When("user enter valid ess admin username and password")
    public void user_enter_valid_ess_admin_username_and_password() {
        System.out.println("This another test");
    }

    @When("user enters different {string} and {string} and verify the {string} for all the combinations")
    public void user_enters_different_and_and_verify_the_for_all_the_combinations(String usernameValue, String passwordValue,
                                                                                  String error) {
       // LoginPage loginPage=new LoginPage();
        //WebElement username = driver.findElement(By.id("txtUsername"));
        //username.sendKeys(usernameValue);
        //loginPage.usernameField.sendKeys(usernameValue);
        sendText(loginPage.usernameField,usernameValue);
       // WebElement password = driver.findElement(By.id("txtPassword"));
       // password.sendKeys(passwordValue);
        //loginPage.passwordField.sendKeys(passwordValue);
        sendText(loginPage.passwordField,passwordValue);
       // WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //loginButton.click();
        //loginPage.loginButton.click();
        click(loginPage.loginButton);

       // WebElement errorMassage=driver.findElement(By.id("spanMessage"));
        String errorActual=loginPage.errorMassage.getText();
        Assert.assertEquals("Values do not match", error, errorActual);
    }
    @When("user enters different {string} and {string}")
    public void user_enters_different_and(String usernameValue, String passwordValue) {
       // LoginPage loginPage=new LoginPage();
        //WebElement username = driver.findElement(By.id("txtUsername"));
       // loginPage.usernameField.sendKeys(usernameValue);

        sendText(loginPage.usernameField,usernameValue);
       // WebElement password = driver.findElement(By.id("txtPassword"));
        //loginPage.passwordField.sendKeys(passwordValue);
        sendText(loginPage.passwordField,passwordValue);
    }

    @Then("{string} user is successfully logged in")
    public void user_is_successfully_logged_in(String admin) {
        //DashBoardPage dashBoardPage=new DashBoardPage();
       WebElement dashBordMassage= driver.findElement(By.id("welcome"));
       Assert.assertTrue(dashBordMassage.isDisplayed());
    }
    @When("user is logged in with admin credentials")
    public void user_is_logged_in_with_admin_credentials() {
        loginPage.login(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));

    }



}
