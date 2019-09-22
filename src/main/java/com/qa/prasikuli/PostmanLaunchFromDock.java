package com.qa.prasikuli;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class PostmanLaunchFromDock {

    private Screen screen;
    private Pattern image;
    private final String imagesPath = System.getProperty("user.dir") + "/images/";

    @Test
    public void sikulitest() throws FindFailed, InterruptedException {

        screen = new Screen();
        image = new Pattern(imagesPath + "postman.png");
        screen.wait(image, 10);

        screen.doubleClick();

        image = new Pattern(imagesPath + "close-postman.png");
        screen.wait(image, 10);
        screen.click();

        image = new Pattern(imagesPath + "plus-icon.png");
        screen.wait(image, 10);
        screen.click();
    }
}