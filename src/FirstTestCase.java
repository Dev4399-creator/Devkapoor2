import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase{
    @Test
    @SuppressWarnings({"unchecked", "deprecated"})
    public void testNGAsserts() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\devil\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        String actualTitle = "Demo Script Test drive - PHPTRAVELS";
        Assert.assertEquals(driver.getTitle(), actualTitle);
        WebElement file = driver.findElement(By.id("icon"));
        if (file.isDisplayed()) {
            System.out.println("Image displayed.");
        } else {
            System.out.println("Image Not displayed.");
        }
        driver.close();
    //Done
    }
}
