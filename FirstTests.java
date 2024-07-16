
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

import java.util.List;
import java.util.ListIterator;

public class FirstTests {
    @Test
    public void registerUser() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://practice.automationtesting.in/my-account/");
        Thread.sleep(5000);
       WebElement consentButton= driver.findElement(By.cssSelector("button.fc-cta-consent"));
       consentButton.click();
       driver.findElement(By.id("reg_email")).sendKeys("bbb2@abv.bg");
       String password = "Strongpassword12345@";
       for (int i = 0; i <password.length(); i++) {
           driver.findElement(By.id("reg_password")).sendKeys(password.substring(i,i+1));
       }
driver.findElement(By.xpath("//input[@name='register']")).click();
        List<WebElement>paragraphs=driver.findElements(By.cssSelector("div.woocommerce-MyAccount-content>p"));
        paragraphs.get(0).getText().contains("bbb");
driver.close();

       }

    }
