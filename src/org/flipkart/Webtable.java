package org.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v97.page.Page.GetAppIdResponse;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\haroa\\eclipse-workspace\\MobileSpecification\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		
	   List<WebElement> itable= driver.findElements(By.tagName("table")) ;
	   for (int k = 1; k < itable.size(); k++) {
		 WebElement table = itable.get(k) ; 
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> irow = tbody.findElements(By.tagName("tr"));
		for (int i = 0; i < irow.size();i++) {
			
			WebElement row = irow.get(i);
			List<WebElement>  idata = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < idata.size(); j++) {
				
				WebElement data = idata.get(j);
				String text = data.getText();
				System.out.println(text);
				
				
				
			}
				
				
				
							}
			
			
		}
			
			
		}
	}

