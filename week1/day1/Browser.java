package week1.day1;

public class Browser {
	
	public void launchBrowser(String browserName)
	{
		System.out.println("Browser " +browserName+ " was launched successfully");
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b = new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();
	}

}
