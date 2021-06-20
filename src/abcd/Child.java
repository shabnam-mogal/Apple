package abcd;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {

	public static void main(String[] args) {

		
		
		
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-89 version_present_use\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.naukri.com/");
String parent=driver.getWindowHandle();
Set<String>s=driver.getWindowHandles();
Iterator <String> I1=s.iterator();
while(I1.hasNext()){
	String child_window=I1.next();
	if(!parent.equals(child_window)){
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
	
		
	driver.close();
	}
}
driver.switchTo().window(parent);
System.out.println(driver.switchTo().window(parent).getTitle());

	}

}
