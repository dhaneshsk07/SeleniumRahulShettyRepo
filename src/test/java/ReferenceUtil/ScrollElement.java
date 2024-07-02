package ReferenceUtil;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScrollElement {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://example.com");

	       // WebElement element = driver.findElement(By.id("element-id"));

	        // -----Scroll the element into view using JavaScript-----
	        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	        // -----Close the browser----
	        driver.quit();
	    }
	}



