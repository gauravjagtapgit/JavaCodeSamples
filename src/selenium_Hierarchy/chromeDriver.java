package selenium_Hierarchy;

public class chromeDriver implements WebDriver {
	
	public chromeDriver() {
		System.out.println("launch chrom browser");
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
