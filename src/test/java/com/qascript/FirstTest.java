import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

    @Test
    public void checkPageTitle() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Set the path to the Google Chrome executable
        System.setProperty("webdriver.chrome.bin", "/usr/bin/google-chrome");

        // Create ChromeOptions and specify the binary location
        ChromeOptions options = new ChromeOptions();
        options.setBinary(System.getProperty("webdriver.chrome.bin"));
        chrome_options = Options()
        chrome_options.add_argument("--disable-extensions")
        chrome_options.add_argument("--disable-gpu")
        chrome_options.add_argument("--no-sandbox")
        driver = webdriver.Chrome(options=chrome_options)
            
        // Create a new instance of the Chrome driver with the specified options
        WebDriver driver = new ChromeDriver(options);

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
