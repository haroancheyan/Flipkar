package org.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipakart {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\haroa\\eclipse-workspace\\MobileSpecification\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		String url = "https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click";
	
		driver.navigate().to(url);
	
		
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Missing Cart items')]"));
		String text1 = element.getText();
		System.out.println(text1);
		
		
		
		//driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _1sbqEe _3AWRsL')]")).click();
		
		//driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		
		//WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid Email')"));
		//String text2 = element1.getText();
		//System.out.println(text2);
		
		
	}

}
