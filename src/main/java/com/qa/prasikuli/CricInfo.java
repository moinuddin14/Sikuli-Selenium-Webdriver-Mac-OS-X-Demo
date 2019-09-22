package com.qa.prasikuli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class CricInfo {

    public WebDriver driver;
    public WebElement element;

    @Test
    public void sikulitest() throws FindFailed, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.espncricinfo.com/");

        Screen screen = new Screen();
        Pattern image = new Pattern("/Users/moin/Documents/sikuli-demo/Sikuli/images/ashes-image.png");
        screen.wait(image, 10);
        screen.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
