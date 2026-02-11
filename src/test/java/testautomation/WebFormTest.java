package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebFormTest {

    @Test
    public void testcase1() {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");

        //Text input
        By textElement = By.xpath("/html/body/main/div/form/div/div[1]/label[1]");
        WebElement webTextElement = driver.findElement(textElement);
        //Assert.assertTrue(webTextElement.isSelected());
        webTextElement.sendKeys("Amira");

        //Password
        By passwordElement = By.xpath("/html/body/main/div/form/div/div[1]/label[2]");
        WebElement webPasswordElement = driver.findElement(passwordElement);

        webPasswordElement.sendKeys("amira");

        //Text Area
        By textAreaElement = By.xpath("/html/body/main/div/form/div/div[1]/label[3]/textarea");
        WebElement webTextAreaElement = driver.findElement(textAreaElement);
        webTextAreaElement.sendKeys("Amira Mohamed");

        //Check box
        By checkBoxElement = By.xpath("//*[@id=\"my-check-1\"]");
        WebElement webCheckBoxElement = driver.findElement(checkBoxElement);
        // webCheckBoxElement.click();
        Assert.assertTrue(webCheckBoxElement.isSelected());

        //Dropdown menu
        By dropdownElement = By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select");
        WebElement dropdownWebElement = driver.findElement(dropdownElement);
        // dropdownWebElement.s;

    }


    }

