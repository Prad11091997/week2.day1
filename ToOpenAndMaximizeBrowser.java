package SeleniumProgram;
	
	import org.openqa.selenium.chrome.ChromeDriver;

    import io.github.bonigarcia.wdm.WebDriverManager;

	public class ToOpenAndMaximizeBrowser {

		public static void main(String[] args) {
			//To create a relnship between selenium and driver
			WebDriverManager.chromedriver().setup();
			//To open a chrome browser
			ChromeDriver driver = new ChromeDriver();
			//To load an URL to the browser, we use
			driver.get("http://leaftaps.com/opentaps/control/login");
			//To maximize the browser
			driver.manage().window().maximize();
			//To close the browser
			driver.close();
		 }
	}


