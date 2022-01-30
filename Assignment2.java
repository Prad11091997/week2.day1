package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	
	public static void main(String[] args) {
		//To create a relnship between selenium and driver
		WebDriverManager.chromedriver().setup();
		//To open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		//To load an URL to the browser, we use
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To maximize the browser
		driver.manage().window().maximize();
		//To enter Username                   sendKeys is used to type the word
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//To enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//To click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//To click CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//To click Contacts
		driver.findElement(By.partialLinkText("Contacts")).click();
		//To click Create Contact
		driver.findElement(By.partialLinkText("Create Contact")).click();
		//To enter firstName
		driver.findElement(By.id("firstNameField")).sendKeys("Pradeep");
		//To enter lastName
		driver.findElement(By.id("lastNameField")).sendKeys("Subramani");
		//To click Create Contact button
		driver.findElement(By.className("smallSubmit")).click();
		//To print firstName
		String firstName = "Pradeep";
		System.out.println(firstName);
		//To print browser title
		System.out.println("Browser title is "+ driver.getTitle());
		//To close the browser
		driver.close();
		
		
	}

}
