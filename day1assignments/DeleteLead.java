package Week4.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  EdgeDriver driver=new EdgeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/main");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.partialLinkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("//span[text()='Phone']")).click();
		    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9840693453");
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    Thread.sleep(500);
			WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
			System.out.println(element.getText());

			element.click();

			driver.findElement(By.xpath("//a[text()='Delete']")).click();

			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

			driver.findElement(By.xpath("//span[text()='Phone']")).click();

			driver.findElement(By.name("phoneNumber")).sendKeys("9840693453");

			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(500);
			String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			if (text.contains("No records")) {
				System.out.println(text);
			} else {
				System.out.println("The lead is not deleted ");

			}

		}
			
			
		    

}
