package Week4.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {

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
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anu");

	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("ASE");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	if(text.contains("ASE")){
		System.out.println("correct output");
	}
	else {
			System.out.println("wrong output");
		}
			}
	}

