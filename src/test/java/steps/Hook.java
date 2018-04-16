package steps;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void openBrowser(){
        ChromeDriverManager.getInstance().setup();
        baseUtil.driver = new ChromeDriver();
    }

    @After
    public void closeBrowser(){
        baseUtil.driver.close();
    }
}
