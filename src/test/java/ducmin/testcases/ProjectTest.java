package ducmin.testcases;

import ducmin.common.BaseTest;
import ducmin.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    @BeforeMethod
    public void setupTest() {
        loginPage = new LoginPage();
    }

    @Test
    public void testOpenProject() {
        dashboardPage = loginPage.logIn("admin01", "123456"); //dashboardPage = new DashboardPage(driver);
        dashboardPage.openProject();

    }

    @Test
    public void testAddProject() {
        dashboardPage = loginPage.logIn("frances.burns", "frances.burns");
        projectPage = dashboardPage.openProject();
        projectPage.addProject("PD0110A1");
    }

    @Test
    public void testNavigateToTasks() {
        dashboardPage = loginPage.logIn("leader01", "123456");
        projectPage = dashboardPage.openProject();
        projectPage.openTask();

    }

}
