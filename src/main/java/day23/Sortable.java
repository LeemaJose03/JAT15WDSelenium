package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(item5, item4).dragAndDrop(item3, item2).perform();
		
		mouse.doubleClick(item7).perform();  // double click
		
		mouse.contextClick(item7).perform();  // right click 
		
	
		
		
		
	}

}
