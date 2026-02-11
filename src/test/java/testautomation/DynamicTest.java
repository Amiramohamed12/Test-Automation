package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicTest {
        @Test
        public void testcase2() {
            WebDriver driver = new EdgeDriver();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Add box
            //   By addBoxElement = By.xpath("//*[@id=\"adder\"]");
            // WebElement webAddBoxElement = driver.findElement(addBoxElement);
            WebElement webAddBoxElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"adder\"]")));
            webAddBoxElement.click();

            //Reveal new input
            By newInputElement = By.xpath("//*[@id=\"reveal\"]");
            WebElement webNewInputElement = driver.findElement(newInputElement);
            webNewInputElement.click();

            //Field
            By fieldElement = By.xpath("//*[@id=\"revealed\"]");
            WebElement webFieldElement = driver.findElement(fieldElement);
            webFieldElement.sendKeys("Hi");


        }
    }

