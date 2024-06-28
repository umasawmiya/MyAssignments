package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched Successfully");
		return browserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser b = new Browser();
		String a = b.launchBrowser("Chrome");
		System.out.println(a);
		b.loadUrl();

		
		
		// TODO Auto-generated method stub

	}

}
