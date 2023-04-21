package selenium_Hierarchy;

public class FirfoxDrivr implements WebDriver {
	
	public FirfoxDrivr() {
		System.out.println("launch firfox browser");
	}

	@Override
	public void get(String url) {
		
		System.out.println("launch url: "+ url);
	}

	@Override
	public void findElement(String locator) {
	      
		System.out.println("finding the element"+ locator);
	}

	@Override
	public void close() {
		
		System.out.println("close the browser");
	}

	@Override
	public void quit() {
		System.out.println("quit all the browser");
		
	}

}
