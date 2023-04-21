package selenium_Hierarchy;

public class Amezon_Test {
	
	public static void main(String[] args) {
		 
		WebDriver driver =new chromeDriver();
		driver.get("http://www.amezhon.com");
		
		driver.findElement("Home page");
		
		driver.close();
		
		driver.quit();	
		
		System.out.println(" ");
		WebDriver drivers =new FirfoxDrivr();
		drivers.get("http://www.flipkart.com");
		drivers.findElement("Electronics prodects");
		drivers.close();
		drivers.quit();
	}

}
