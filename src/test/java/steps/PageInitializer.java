package steps;

import pages.AddNewEmployeePage;
import pages.DashBoardPage;
import pages.EmployeeDetalPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashBoardPage dashBoardPage;
    public static EmployeeListPage employeeListPage;
    public static AddNewEmployeePage addNewEmployeePage;
    public static EmployeeDetalPage employeeDetalPage;

    public static void initializePageObject(){
        loginPage=new LoginPage();
        dashBoardPage=new DashBoardPage();
        employeeListPage=new EmployeeListPage();
        addNewEmployeePage=new AddNewEmployeePage();
        employeeDetalPage=new EmployeeDetalPage();
    }
}
