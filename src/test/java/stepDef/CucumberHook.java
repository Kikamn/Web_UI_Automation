package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook extends BaseTest {
    @Before
    public void beforeTest(){
        getDriver();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
