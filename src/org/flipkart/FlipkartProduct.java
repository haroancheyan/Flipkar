package org.flipkart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlipkartProduct {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\haroa\\eclipse-workspace\\MobileSpecification\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		String url = "https://www.amazon.in/";
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("smart watche");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(3000);
		
		WebElement element2 = driver.findElement(By.xpath("(//*[text()='Noise ColorFit Pulse Spo2 Smart Watch with 10 days battery life, 60+ Watch Faces, 1.4\" Full Touch HD Display Smartwatch, 24*7 Heart Rate Monitor Smart Band, Sleep Monitoring Smart Watches for Men and Women & IP68 Waterproof (Jet Black)'])[1]"));
		String text = element2.getText();
		System.out.println(text);
		//Thread.sleep(3000);
		
		element2.click();
		Thread.sleep(3000);
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> ChildId = driver.getWindowHandles();
		List<String> child = new ArrayList<>(ChildId);
		driver.switchTo().window(child.get(1));
		
		WebElement element3 = driver.findElement(By.xpath("//span[@id='productTitle']")); 
		String text2 = element3.getText();
		System.out.println(text2);
		
		
		if (text.equals(text2)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		WebElement drop = driver.findElement(By.xpath("//select[contains(@name,'quantity')]"));
		Select s = new Select(drop);
		s.selectByIndex(4);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click(); 
		Thread.sleep(3000);
		
		WebElement element4 = driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']"));
		element4.sendKeys("623529");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-button-inner a-declarative'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Added to Cart')]"));
		String text3 = cart.getText();
		
		String text4 = "//span[contains(text(),'Added to Cart')]";
		
		if (text3.equals(text4)) {
			System.out.println("we can take screenshot");
			TakesScreenshot tk = (TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\haroa\\eclipse-workspace\\Flipkart\\library");
			FileUtils.copyFile(src, trg);
			
		}
		else {
			System.out.println("we cant take screenshot");
		}
		
		driver.findElement(By.xpath("//*[contains(@id,'nav-cart-count-container')]")).click();
		
		WebElement remove = driver.findElement(By.xpath("//*[contains(@class,'a-truncate-cut')]"));
		String text5 = remove.getText();
		
		if (text5.endsWith(text2)) {
			System.out.println("succes");
		}
		else {
			System.out.println("Failure");
		}
		
		
	}
		
		
		}
		
		
		
		
	

