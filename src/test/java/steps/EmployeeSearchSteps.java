package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("use navigate to employee list page")
    public void use_navigate_to_employee_list_page() {
      WebElement pimOption=driver.findElement(By.id("menu_pim_viewPimModule"));
      pimOption.click();
      WebElement employeeListOption= driver.findElement(By.id("menu_pim_viewEmployeeList"));
      employeeListOption.click();
    }

    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
    WebElement searchByID= driver.findElement(By.id("empsearch_id"));
    searchByID.sendKeys("23638000");
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
      WebElement searchButton= driver.findElement(By.id("searchBtn"));
      searchButton.click();
    }

    @When("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Information is displayed on page");
    }
    @When("user enter valid employee name")
    public void user_enter_valid_employee_name() {
       WebElement name= driver.findElement(By.id("empsearch_employee_name_empName"));
       name.sendKeys("XYZT");
    }



}
