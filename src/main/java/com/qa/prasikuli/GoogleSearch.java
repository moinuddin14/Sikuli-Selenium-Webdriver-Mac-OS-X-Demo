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

public class GoogleSearch {

	public WebDriver driver;
	public WebElement element;

	@Test
	public void sikulitest() throws FindFailed, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		Screen screen = new Screen();
		Pattern image = new Pattern("/Users/moin/Documents/sikuli-demo/Sikuli/images/google-input.png");
		screen.wait(image, 10);
		screen.type(image, "Sikuli Java");

		Pattern image2 = new Pattern("/Users/moin/Documents/sikuli-demo/Sikuli/images/google-search-button.png");
		screen.wait(image2, 10);
		screen.click();

		Thread.sleep(5000);
		driver.quit();
	}
}