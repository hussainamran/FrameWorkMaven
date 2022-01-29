package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddNewEmployeePage;
import pages.DashBoardPage;
import pages.EmployeeListPage;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReading;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user click on Pim Option")
    public void user_click_on_pim_option() {

        //DashBoardPage dashBoardPage=new DashBoardPage();

        //WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
       // dashBoardPage.PimOption.click();
        click(dashBoardPage.PimOption);
    }
    @When("user click on Add employee button")
    public void user_click_on_add_employee_button() {
       // DashBoardPage dashBoardPage=new DashBoardPage();

       // WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        //dashBoardPage.addEmployeeOption.click();
        click(dashBoardPage.addEmployeeOption);
    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
       // AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();

        //WebElement firstName = driver.findElement(By.id("firstName"));
        //addNewEmployeePage.firstName.sendKeys("Nammar");
        sendText(addNewEmployeePage.firstName,"Nammar");
        //WebElement lastName = driver.findElement(By.id("lastName"));
        //addNewEmployeePage.lastName.sendKeys("MS");
        sendText(addNewEmployeePage.lastName,"MS");
    }
    @When("user click on save button")
    public void user_click_on_save_button() {
       // AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();
        //WebElement savebutton= driver.findElement(By.id("btnSave"));
       // addNewEmployeePage.saveButton.click();
        click(addNewEmployeePage.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added succesfully");
    }

    @When("user enter {string} {string} and {string}")
    public void user_enter_and(String firstName, String middleName, String  lastName) {

       // AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();
        //WebElement firstNameLoc = driver.findElement(By.id("firstName"));
       // addNewEmployeePage.firstName.sendKeys(firstName);
        sendText(addNewEmployeePage.firstName,firstName);
        //WebElement lastNameLoc = driver.findElement(By.id("lastName"));
       // addNewEmployeePage.lastName.sendKeys(lastName);
        sendText(addNewEmployeePage.lastName,lastName);
       // WebElement middleNameLoc = driver.findElement(By.id("middleName"));
       // addNewEmployeePage.middleName.sendKeys(middleName);
        sendText(addNewEmployeePage.middleName,middleName);
    }
    @When("user enter direct data {string} {string} and {string}")
    public void user_enter_direct_data_and(String firstName, String middleName, String lastName) {
       // AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();

       // WebElement firstNameLoc = driver.findElement(By.id("firstName"));
       //addNewEmployeePage. firstName.sendKeys(firstName);
       sendText(addNewEmployeePage.firstName,firstName);
        //WebElement lastNameLoc = driver.findElement(By.id("lastName"));
       // addNewEmployeePage.lastName.sendKeys(lastName);
        sendText(addNewEmployeePage.lastName,lastName);
        //WebElement middleNameLoc = driver.findElement(By.id("middleName"));
        //addNewEmployeePage.middleName.sendKeys(middleName);
        sendText(addNewEmployeePage.middleName,middleName);
    }

    @When("user add multiple employees and verify they are added")
    public void user_add_multiple_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();

        for (Map<String, String> emp : employeeNames){
            String firstNameValue = emp.get("firstName");
            String middleNameValue = emp.get("middleName");
            String lastNameValue = emp.get("lastName");

           // AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();

            //WebElement firstNameLoc = driver.findElement(By.id("firstName"));
            //addNewEmployeePage.firstName.sendKeys(firstNameValue);
            sendText(addNewEmployeePage.firstName, firstNameValue);
            //WebElement lastNameLoc = driver.findElement(By.id("lastName"));
            //addNewEmployeePage.lastName.sendKeys(lastNameValue);
            sendText(addNewEmployeePage.lastName,lastNameValue);
            //WebElement middleNameLoc = driver.findElement(By.id("middleName"));
            //addNewEmployeePage.middleName.sendKeys(middleNameValue);
            sendText(addNewEmployeePage.middleName,middleNameValue);

           // WebElement saveButton = driver.findElement(By.id("btnSave"));
           // addNewEmployeePage.saveButton.click();
            click(addNewEmployeePage.saveButton);

            //Assertions in Homework
            Thread.sleep(5000);

            //to come back again on add employee screen because hooks and background works just one time
           // WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
           // DashBoardPage dashBoardPage=new DashBoardPage();
            //dashBoardPage.addEmployeeOption.click();
            click(dashBoardPage.addEmployeeOption);
            Thread.sleep(3000);
        }

    }
    @When("user add multiple employees from excel file using {string} sheet and verify and added employee")
    public void user_add_multiple_employees_from_excel_file_using_sheet_and_verify_and_added_employee(String sheetName) throws InterruptedException {

        List<Map<String, String>> newEmployees = ExcelReading.excelIntoListMap(Constants.TESTDATA_FILEPATH,sheetName);

        //AddNewEmployeePage addNewEmployeePage=new AddNewEmployeePage();

        Iterator<Map<String, String>> itr = newEmployees.iterator();
        // it check whether we have element or not
        while (itr.hasNext()){
            // it returns the Key and value for employees
            Map<String, String> mapNewEmp = itr.next();

           // WebElement firstNameLoc = driver.findElement(By.id("firstName"));
            addNewEmployeePage.firstName.sendKeys(mapNewEmp.get("FirstName"));
           // WebElement lastNameLoc = driver.findElement(By.id("lastName"));
            addNewEmployeePage.lastName.sendKeys(mapNewEmp.get("LastName"));
            //WebElement middleNameLoc = driver.findElement(By.id("middleName"));
            addNewEmployeePage.middleName.sendKeys(mapNewEmp.get("MiddleName"));

            // Asseration start
            //WebElement empId = driver.findElement(By.id("employeeId"));
            String empIdValue = addNewEmployeePage.empIdLoc.getAttribute("value");

            WebElement photo = driver.findElement(By.id("photofile"));
            addNewEmployeePage.photograph.sendKeys(mapNewEmp.get("Photograph"));


            //WebElement checkBox = driver.findElement(By.id("chkLogin"));
            if(!addNewEmployeePage.checkbox.isSelected()){
               // addNewEmployeePage.checkbox.click();
                click(addNewEmployeePage.checkbox);
            }

          //  WebElement username = driver.findElement(By.id("user_name"));
           // WebElement password = driver.findElement(By.id("user_password"));
           // WebElement confirmPassword = driver.findElement(By.id("re_password"));

            //addNewEmployeePage.createUsername.sendKeys(mapNewEmp.get("Username"));
            sendText(addNewEmployeePage.createUsername,"Username");
            //addNewEmployeePage.createPassword.sendKeys(mapNewEmp.get("Password"));
            sendText(addNewEmployeePage.createPassword,"Password");
           // addNewEmployeePage.rePassword.sendKeys(mapNewEmp.get("Password"));
            sendText(addNewEmployeePage.rePassword,"Password");
           // WebElement saveButton = driver.findElement(By.id("btnSave"));
            //addNewEmployeePage.saveButton.click();
            click(addNewEmployeePage.saveButton);

            Thread.sleep(5000);

            //Assertions in Homework
            //grab emp id while adding the employee
            //search it in the employee list
            //use for loop to compare the values

           // DashBoardPage dashBoardPage=new DashBoardPage();

            //WebElement empList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
            //dashBoardPage.employeeListButton.click();
            click(dashBoardPage.employeeListButton);
           // EmployeeListPage employeeListPage=new EmployeeListPage();

            //WebElement empIdSearchField = driver.findElement(By.id("empsearch_id"));
           // employeeListPage.idEmployeeSearch.sendKeys(empIdValue);
            sendText(employeeListPage.idEmployeeSearch,empIdValue);
           // WebElement searchButton = driver.findElement(By.id("searchBtn"));
            //employeeListPage.searchButton.click();
            click(employeeListPage.searchButton);

            List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for(int i=0; i<rowData.size(); i++){
                System.out.println("I am inside my loop");
                String rowText = rowData.get(i).getText();
                System.out.println(rowText);

                String expectedData =  empIdValue + " " + mapNewEmp.get("FirstName") + " " + mapNewEmp.get("MiddleName")
                        + " " + mapNewEmp.get("LastName");
                System.out.println(expectedData);
                Assert.assertEquals(expectedData, rowText);
            }

            //to come back again on add employee screen because hooks and background works just one time
            //WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
           //dashBoardPage.addEmployeeOption.click();
            click(dashBoardPage.addEmployeeOption);
            Thread.sleep(3000);

        }
    }
}


