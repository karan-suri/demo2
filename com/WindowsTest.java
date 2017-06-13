import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class WindowsTest {
	/*
	 * public static void main(String[] args) throws MalformedURLException,
	 * InterruptedException, AWTException { DesktopOptions options = new
	 * DesktopOptions(); options.
	 * setApplicationPath("C:\\Program Files (x86)\\Skype\\Phone\\Skype.exe");
	 * WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999/"),
	 * options); // driver.manage().window().maximize();
	 * System.out.println("Driver Instantiated"); WebDriverWait wait = new
	 * WebDriverWait(driver, 10); WebElement eleRecent =
	 * driver.findElementByXPath("//*[@Name='RECENT']");
	 * 
	 * Robot robot = new Robot(); String bounds =
	 * eleRecent.getAttribute("BoundingRectangle"); String[] arrBounds =
	 * bounds.split(","); int[] arr = new int[arrBounds.length]; for (int i = 0;
	 * i < arrBounds.length; i++) { arr[i] = Integer.parseInt(arrBounds[i]); }
	 * System.out.println("bounds " + arr[0] + "," + arr[1] + "," + arr[2] + ","
	 * + arr[3]); System.out.println("moving to " + arr[0] + "," + arr[1] +
	 * arr[3] / 2); robot.mouseMove(arr[0], (arr[1] + arr[3] / 2));
	 * Thread.sleep(3000); robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); List<WebElement>
	 * listContacts =
	 * wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy( By.
	 * xpath("//*[@Name='Recent messages']//*[contains(@LocalizedControlType,'list item')]"
	 * ))); System.out.println("Contact size :> " + listContacts.size()); for
	 * (WebElement contact : listContacts) { System.out.println("name :> " +
	 * contact.getAttribute("Name")); } }
	 */

	@Test
	public void testCalc() throws MalformedURLException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999/"), options);
		driver.findElementByXPath("//*[@Name='View']").click();

	}
}
