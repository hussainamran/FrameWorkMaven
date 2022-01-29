package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddNewEmployeePage;
import pages.DashBoardPage;
import pages.EmployeeListPage;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("use navigate to employee list page")
    public void use_navigate_to_employee_list_page() {

        //DashBoardPage dashBoardPage=new DashBoardPage();

      //WebElement pimOption=driver.findElement(By.id("menu_pim_viewPimModule"));
      //dashBoardPage.PimOption.click();
      //click(dashBoardPage.PimOption);
      jsClick(dashBoardPage.PimOption);
      //WebElement employeeListOption= driver.findElement(By.id("menu_pim_viewEmployeeList"));
      //dashBoardPage.employeeListButton.click();
      click(dashBoardPage.employeeListButton);
    }

    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {

        EmployeeListPage employeeListPage=new EmployeeListPage();
   // WebElement searchByID= driver.findElement(By.id("empsearch_id"));
    //employeeListPage.idEmployeeSearch.sendKeys("23638000");
    sendText(employeeListPage.idEmployeeSearch,"23638000");
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        //EmployeeListPage employeeListPage=new EmployeeListPage();

     // WebElement searchButton= driver.findElement(By.id("searchBtn"));
      //employeeListPage.searchButton.click();
      click(employeeListPage.searchButton);
    }

    @When("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Information is displayed on page");
    }
    @When("user enter valid employee name")
    public void user_enter_valid_employee_name() {

       // EmployeeListPage employeeListPage=new EmployeeListPage();
       //WebElement name= driver.findElement(By.id("empsearch_employee_name_empName"));
       //employeeListPage.empSearchStepByName.sendKeys("XYZT");
       sendText(employeeListPage.empSearchStepByName,"XYZT");
    }



}
