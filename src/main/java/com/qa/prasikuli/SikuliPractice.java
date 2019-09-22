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

public class SikuliPractice {

	private WebDriver driver;
	private WebElement element;
	private Screen screen;
	private Pattern image;
	private final String imagesPath = System.getProperty("user.dir") + "/images/";

	@Test
	public void sikulitest() throws FindFailed, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants");
		element = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		screen = new Screen();
		image = new Pattern(imagesPath + "phone.png");
		screen.wait(image, 10);
		screen.type(image, "9876543210");

		Thread.sleep(5000);
		driver.quit();
	}
}