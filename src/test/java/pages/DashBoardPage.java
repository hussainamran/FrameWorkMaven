package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashBoardPage extends CommonMethods {
    @FindBy (id = "welcome")
    public WebElement WelcomeMassage;

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement PimOption;

    @FindBy (id = "menu_pim_addEmployee")
    public WebElement addEmployeeOption;

    @FindBy (id = "menu_pim_viewEmployeeList")
    public WebElement employeeListButton;

    @FindBy (xpath= "//div[@class='menu']/ul/li")
    public List<WebElement> dashBoardTabs;



    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }

}
