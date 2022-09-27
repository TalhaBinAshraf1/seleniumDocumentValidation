package selenium.java.documentValidation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[href='\\/login']")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }



}

