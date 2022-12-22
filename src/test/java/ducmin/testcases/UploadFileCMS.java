package ducmin.testcases;

import ducmin.common.BaseTest;
import ducmin.helpers.Helpers;
import ducmin.pages.UploadFileCMSPage;
import ducmin.utils.WebUI;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Epic("Regression Test")
@Feature("Upload Test")
public class UploadFileCMS extends BaseTest {

    @Test
    public void testUploadFileWithSendKeys() throws InterruptedException {
        WebUI.openURL("https://cgi-lib.berkeley.edu/ex/fup.html");
        WebUI.waitForPageLoaded();
        By inputFileUpload = By.xpath("//input[@name='upfile']");

        WebUI.setText(inputFileUpload, Helpers.getCurrentDir() + "datatest/img.png");
        Thread.sleep(3000);
    }

    @Test
    public void testUploadFileInCategoryCMS() {
        UploadFileCMSPage uploadFileCMSPage = new UploadFileCMSPage();
        uploadFileCMSPage.loginCMS();
        uploadFileCMSPage.uploadFileInCategory();
    }

}
