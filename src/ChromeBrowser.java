import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    /*
    Project-4 - ProjectName: com-saucedemo
BaseUrl = https://www.saucedemo.com/
1. Set up Chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current URL.
5. Print the page source.
6. Enter the email in the email field.
7. Enter the password in the password field.
8. Click on the Login Button.
9. Print the current URL.
10. Navigate to baseUrl
11. Refresh the page.
12. Close the browser.
     */
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        // Set up Chrome Browser
        WebDriver driver = new ChromeDriver();
// Open Url
        driver.get(baseurl);
        // Print the Title of the Page
        System.out.println("The Title of the page is "+driver.getTitle());
        //Print the current Url
        System.out.println("Te Current Url is "+driver.getCurrentUrl());
        // Print the Page Source
        System.out.println("The Page Source is "+driver.getPageSource());

        // Enter the email in the email field
        WebElement searchBox = driver.findElement(By.id("user-name"));
        searchBox.sendKeys("sauce");
        //Enter Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sauce");
        // Click on login button
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        // print the current url
        System.out.println("the current url is "+driver.getCurrentUrl());
        //Navigate to baseurl
        driver.navigate().to(baseurl);
        //refresh the page
        driver.navigate().refresh();
        // close the browser
        driver.quit();


    }

}
