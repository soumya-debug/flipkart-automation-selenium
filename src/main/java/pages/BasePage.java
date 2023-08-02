package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class BasePage {
    protected WebDriver driver;

    /**
     * This is the constructor
     */
    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

}
