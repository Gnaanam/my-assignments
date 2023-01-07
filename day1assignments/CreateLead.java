package Week3.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
     String title1= driver.getTitle();
     System.out.println(title1);
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Lead")).click();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deivanai");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathappan");
     WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
     Select drop=new Select(tool);
     drop.selectByIndex(4);
     WebElement choice = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     Select option=new Select(choice);
     option.selectByValue("CATRQ_CARNDRIVER");
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deivasathappan@gmail.com");
     driver.findElement(By.name("submitButton")).click();
     String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
     System.out.println(text);
     if (text.contains("Deivanai")){
    	 System.out.println("name present");
     }
     else
     {
    	 System.out.println("name not present");
     }
     
     String title3= driver.getTitle();
     System.out.println(title3);
     driver.findElement(By.linkText("Duplicate Lead")).click();
     driver.findElement(By.id("createLeadForm_companyName")).clear();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ASE");
     driver.findElement(By.id("createLeadForm_firstName")).clear();
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gnaanam");
     driver.findElement(By.className("smallSubmit")).click();
     String text5 = driver.getTitle();
     System.out.println(text5);
     
	}
}
     
     
     
    
    
    
	


