package TestGitProject.TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

	//@Test
	public void method1() {
		System.out.println("*******************Method 1*****************");
	}
	@Test
	public void goTo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("*******************Method 2************************");
		driver.get("https://yourcrewstaging.webforcefive.com.au/webapp/");
		Thread.sleep(2000);
		//LoginBtn.click();
	}
	//@Test
	public void method2() {
		System.out.println("*******************Method 2************************");
	}

	public void method3() {
		System.out.println("*******************Method 3************************");
	}

	public void method4() {
		System.out.println("*******************Method 4************************");
	}

	public void method5() {
		System.out.println("*******************Method 5************************");
	}

	public void method6() {
		System.out.println("*******************Method 6************************");
	}

	public void method7() {
		System.out.println("*******************Method 7************************");

	}

	public void methodabcd() {
		System.out.println("*******************Method abc************************");

	}

	public void methodabcde() {
		System.out.println("*******************Method xyz123************************");

	}

	public void methodabcdef() {
		System.out.println("*******************Method xyz123456************************");

	}

}
