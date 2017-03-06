package seleniumEasyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

public class WindowPopupModal {

	public static void main(String[] args) throws InterruptedException {
		// set the system property for chrome driver as:
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");

		// defining a reference variable(driver)
		WebDriver driver = new ChromeDriver();

		// Maximize the chrome browser
		driver.manage().window().maximize();

		// Open Google URL on Chrome browser
		driver.get("http://www.seleniumeasy.com/test/");

		// Click 'Start Practising' button
		driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();

		Thread.sleep(2000);

		// Click on window popup modal link
		driver.findElement(By.cssSelector("a[class='list-group-item'][href*='window-popup-modal']")).click();

		// Click on Follow on twitter button
		driver.findElement(By.cssSelector("a[title='Follow @seleniumeasy on Twitter']")).click();

		Thread.sleep(5000);

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will
		// return Set of Strings
		Set<String> numbersWindow = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = numbersWindow.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child
			// window then we will close

			if (!parent.equals(child_window)) {
				
				String title=driver.switchTo().window(child_window).getTitle();
				
				Assert.assertEquals("Selenium Easy (@seleniumeasy) on Twitter", title);
				
				System.out.println(title);
				
			}
		}

				// Fill User name
				driver.findElement(By.cssSelector("input[id='username_or_email']")).sendKeys("rajumaiet");

				// Fill Password
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys("heartlocker");

				// Click on Submit button
				driver.findElement(By.cssSelector("input[type='submit']")).click();

				driver.close();

				// Switch to parent window
				driver.switchTo().window(parent);

				// Click on Like us on FB button
				driver.findElement(By.cssSelector("a[title='Follow @seleniumeasy on Facebook']")).click();

				// It will return the parent window name as a String
				String parent1 = driver.getWindowHandle();

				// This will return the number of windows opened by Webdriver
				// and will return Set of Strings
				Set<String> numbersWindow1 = driver.getWindowHandles();

				// Now we will iterate using Iterator
				Iterator<String> I11 = numbersWindow1.iterator();

				while (I11.hasNext()) {

					String child_window1 = I11.next();

					// Here we will compare if parent window is not equal to
					// child window then we will close

					if (!parent1.equals(child_window1)) {
						driver.switchTo().window(child_window1);

						System.out.println(driver.switchTo().window(child_window1).getTitle());

						/*
						 * // Fill User name
						 * driver.findElement(By.cssSelector("input[id='email']"
						 * )).sendKeys("test360.53@gmail.com");
						 * 
						 * // Fill Password
						 * driver.findElement(By.cssSelector("input[id='pass']")
						 * ).sendKeys("logica360");
						 * 
						 * // Click on Submit button
						 * driver.findElement(By.cssSelector("input[id='u_0_0']"
						 * )).click();
						 */
					}
				}
				driver.close();

				// Switch to parent window
				driver.switchTo().window(parent1);

				// Click on Like us on Follow Twitter & Facebook button
				driver.findElement(By.xpath("//a[contains(text(),'Follow Twitter & Facebook')]")).click();

				// It will return the parent window name as a String
				String parent111 = driver.getWindowHandle();

				// This will return the number of windows opened by
				// Webdriver
				// and will return Set of Strings
				Set<String> numbersWindow111 = driver.getWindowHandles();

				// Now we will iterate using Iterator
				Iterator<String> I111 = numbersWindow111.iterator();

				while (I111.hasNext()) {

					String child_window11 = I111.next();

					// Here we will compare if parent window is not
					// equal to
					// child window then we will close

					if (!parent111.equals(child_window11)) {
						driver.switchTo().window(child_window11);

						System.out.println(driver.switchTo().window(child_window11).getTitle());

						driver.close();

					}
				}
				
				// Switch to parent window
				driver.switchTo().window(parent1);

				// Click on fOllow all button
				driver.findElement(By.cssSelector("a[id='followall']")).click();

				// It will return the parent window name as a
				// String
				String parent1111 = driver.getWindowHandle();

				// This will return the number of windows opened
				// by
				// Webdriver
				// and will return Set of Strings
				Set<String> numbersWindow1111 = driver.getWindowHandles();

				// Now we will iterate using Iterator
				Iterator<String> I1111 = numbersWindow1111.iterator();

				while (I1111.hasNext()) {

					String child_window1111 = I1111.next();

					// Here we will compare if parent window is
					// not
					// equal to
					// child window then we will close

					if (!parent1111.equals(child_window1111)) {
						driver.switchTo().window(child_window1111);

						System.out.println(driver.switchTo().window(child_window1111).getTitle());

						driver.close();

					}
				}
				driver.quit();
			}
		}
