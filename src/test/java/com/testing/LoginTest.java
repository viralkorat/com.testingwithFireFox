package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.stylesheets.LinkStyle;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box1']"));
		
		
		WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).release().build().perform();*/
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		WebElement source=driver.findElement(By.id("a1"));
		
		
		WebElement target = driver.findElement(By.xpath("//body/div[@id='dragScriptContainer']/div[@id='questionDiv']/div[8]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).release().build().perform();
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
	
	}
}
