import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class AutoWebDriver  {
	
	protected RemoteWebDriver webDriver;
	
	public void autoWebDriver(){
		
	}
	public void init()throws Exception{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized", "--disable-extensions"));
//        capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
//        capabilities.setCapability("platform", "Windows 2003");
        webDriver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), capabilities);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        webDriver.setFileDetector(new LocalFileDetector());
//        webDriver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

//        webDriver = new RemoteWebDriver( capabilities);

	}
	
	public void close()throws Exception
	{
		webDriver.close();
	}

}
