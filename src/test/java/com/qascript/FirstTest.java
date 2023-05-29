import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void checkPageTitle() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://www.google.co.uk/");

        // Get the page title
        String pageTitle = driver.getTitle();

        // Check if the word "Google" exists in the page title
        boolean containsGoogle = pageTitle.contains("Google");

        // Close the browser
        driver.quit();

        // Assert the result
        Assert.assertTrue("Page title does not contain 'Google'", containsGoogle);
    }
}


