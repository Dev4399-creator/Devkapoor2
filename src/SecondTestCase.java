import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SecondTestCase {
    @Test
    @SuppressWarnings({"unchecked", "deprecated"})
    public void ImagesAndButtons() throws Exception {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\devil\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Integer counter = 0;
        Integer btn = 0;
        driver.get("https://phptravels.com/demo/");
        Thread.sleep(20000);

        //System.out.println("Getting Images and Button elements to the list:");
        List<WebElement> Images = driver.findElements(By.tagName("img"));
        List<WebElement> Buttons = driver.findElements(By.tagName("button"));

        System.out.println("No. of Images: " + Images.size());
        System.out.println("No. of Buttons: " + Buttons.size());



        driver.close();

    }
}