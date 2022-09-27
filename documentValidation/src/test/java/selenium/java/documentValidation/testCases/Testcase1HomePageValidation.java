package selenium.java.documentValidation.testCases;


import org.testng.annotations.Test;
import selenium.java.documentValidation.pages.HomePage;

public class Testcase1HomePageValidation extends BaseClass{
    @Test
    public void testcase1HomePageValidation(){

        HomePage hp = new HomePage(driver);

    }
}
