import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class Gestures_1 extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement ele=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		TouchAction t =new TouchAction(driver);
		t.tap(tapOptions().withElement(element(ele))).perform();

	}

}
