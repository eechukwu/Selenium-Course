import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://www.example.com");

        // Get the page title
        String pageTitle = driver.getTitle();

        // Check if the word "Google" exists in the page title
        boolean containsGoogle = pageTitle.contains("Google");

        // Print the result
        if (containsGoogle) {
            System.out.println("The page title contains the word 'Google'.");
        } else {
            System.out.println("The page title does not contain the word 'Google'.");
        }

        // Close the browser
        driver.quit();
    }
}



