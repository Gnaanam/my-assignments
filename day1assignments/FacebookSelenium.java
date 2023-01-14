package Week4.day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EdgeOptions option = new EdgeOptions();
     option.addArguments("--disable notifications");
     EdgeDriver driver=new EdgeDriver();
     driver.get(" https://en-gb.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("//a[text()=\'Create New Account\']")).click();
     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("deiva");
     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sathappan");
     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("deivasathappan@gmail.com");
     driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Gnaanam23");
     WebElement day = driver.findElement(By.id("day"));
     Select days=new Select(day);
     days.selectByValue("11");
     WebElement month = driver.findElement(By.id("month"));
     Select months=new Select(month);
     months.selectByValue("5");
     WebElement year = driver.findElement(By.id("year"));
	Select years=new Select(year);
	years.selectByValue("1990");
		
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
    
	}


