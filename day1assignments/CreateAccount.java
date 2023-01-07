package Week3.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
	     driver.manage().window().maximize();
	     String title = driver.getTitle();
	     System.out.println(title);
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Accounts")).click();
	     driver.findElement(By.linkText("Create Account")).click();
	     driver.findElement(By.id("accountName")).sendKeys("Deivanai");
	     driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	     driver.findElement(By.name("annualRevenue")).sendKeys("50 Lakhs");
	     WebElement ind = driver.findElement(By.name("industryEnumId"));
	     Select option=new Select(ind);
	     option.selectByVisibleText("Computer Software");
	     WebElement source = driver.findElement(By.id("dataSourceId"));
	     Select drop=new Select(source);
	     drop.selectByValue("LEAD_EMPLOYEE");
	     driver.findElement(By.className("smallSubmit")).click();
	     
	     
	}

}
