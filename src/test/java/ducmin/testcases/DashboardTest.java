package ducmin.testcases;

import ducmin.common.BaseTest;
import ducmin.pages.DashboardPage;
import ducmin.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setupTest() {
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void testOpenProjectPage() {
        dashboardPage = loginPage.logIn("admin01", "123456");
        dashboardPage.openProject();
    }

    @Test
    public void testNavigateToProject() {
        dashboardPage = loginPage.logIn("leader01", "123456");
        dashboardPage.openProject();
    }

}
