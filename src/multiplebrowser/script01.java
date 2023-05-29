package multiplebrowser;

public class script01 extends OpenBrowser {
	
		public static void testscript()
		{
			driver.get("http://www.facebook.com");
			
			String title=driver.getTitle();
			System.out.println(title);
		}
	
	public static void main(String[] args) {
		selectBrowser("Firefox");
		testscript();
	}

}
