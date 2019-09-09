//import java.util.regex.Pattern;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;
//
//public class Ibsie {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @Before
//  public void setUp() throws Exception {
//	  String service = "C:\\QA INSTALL\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe";
//	  System.setProperty("webdriver.ie.driver", service);
//	    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//      // this line of code is to resolve protected mode issue capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//      capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		InternetExplorerDriver  driver = new InternetExplorerDriver();
//		//driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
//
//    baseUrl = "http://192.168.103.129:8080/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    driver.get(baseUrl + "/internetbanking/index.form");
//    new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTPS");
//    String host=driver.findElement(By.id("site_url_label")).getText();
//    System.out.println("Hosting url :  " + host);
//    if(baseUrl!= host)
//    {
//  	new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV");
//    }
//  else
//    {
//  	 if(baseUrl!= host)
//  	  {
//  		new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV2");
//  	  }
//  	else
//  	  {
//  		if(baseUrl!= host)
//  		  {
//  			new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING");
//  		  }
//  		else
//  		{
//  			if(baseUrl!= host)
//  			  {
//  				new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTP");
//  			  }
//  			else
//  			{
//  				if(baseUrl!= host)
//  				  {
//  					new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV3");
//  				  }
//  				else
//  				{
//  					if(baseUrl!= host)
//  					  {
//  						new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV4");
//  					  }
//  					else
//  					{
//  						if(baseUrl!= host)
//  						  {
//  							new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("DEV_NL");
//  						  }
//  						else
//  						{
//  							if(baseUrl!= host)
//  							  {
//  								new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA1");
//  							  }
//  							else
//  							{
//  								if(baseUrl!= host)
//  								  {
//  									new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA");
//  								  }
//  								else
//  								{
//  									if(baseUrl!= host)
//  									  {
//  										new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA_NL");
//  									  }
//  									else
//  									{
//  										if(baseUrl!= host)
//  										  {
//  											new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("QA2");
//  										  }
//  										else
//  										{
//  											if(baseUrl!= host)
//  											  {
//  												new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("MERCHANT TEST");
//  											  }
//  											else
//  											{
//  												if(baseUrl!= host)
//  												  {
//  													new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("PRODUCTION");
//  												  }
//  												else
//  												{
//  													if(baseUrl!= host)
//  													  {
//  														new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("BACKUP_DC_PRODUCTION_EXT");
//  													  }
//  													else
//  													{
//  														  }
//
//  												}
//
//  											}
//
//  										}
//
//  									}
//
//  								}
//
//  							}
//
//  						}
//
//  					}
//
//  				}
//
//  			}
//
//  		}
//
//  	  }
//  	  }
//  String host1=driver.findElement(By.id("site_url_label")).getText();
//    System.out.println("Hosting url :  " + host1);
//    //new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTPS");
//   new Select(driver.findElement(By.id("override_store_id"))).selectByVisibleText("Branded - IS34926840");
//   new Select(driver.findElement(By.id("theme"))).selectByVisibleText("buymyevoucher");
//    driver.findElement(By.id("submit_button")).click();
//
//  /* new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Swedbank");
//    driver.findElement(By.cssSelector("option[value=\"59\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.navigate().back();
//   new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Forex Bank");
//    driver.findElement(By.cssSelector("option[value=\"53\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.navigate().back();
//    driver.navigate().refresh();
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Bank 2 Bankaktiebolag");
//    driver.findElement(By.cssSelector("option[value=\"169\"]")).click();
//    if(driver.findElement(By.id("launchbankbtn")).isEnabled()){
//    	driver.findElement(By.id("launchbankbtn")).click();
//    	 driver.navigate().back();
//    	 driver.navigate().refresh();
//    	}
//    	else{
//    	//button is not enabled
//    	//driver.navigate().refresh();
//    		    	}
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Danske Bank");
//    driver.findElement(By.cssSelector("option[value=\"45\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.navigate().back();
//    driver.navigate().refresh();
//   */
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Swedbank");
//  //  driver.findElement(By.cssSelector("option[value=\"59\"]")).click();
//     driver.findElement(By.id("launchbankbtn")).click();
//     driver.navigate().back();
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Forex Bank");
//   // driver.findElement(By.cssSelector("option[value=\"53\"]")).click();
//     boolean Error = driver.getPageSource().contains("Webpage has expired");
//     if (Error == true)
//     {
//      System.out.print("Login unsuccessful\n");
//      driver.navigate().forward();
//     }
//     else
//     {
//
//      System.out.print("Login successful\n");
//      driver.findElement(By.id("launchbankbtn")).click();
//     }
//     driver.findElement(By.id("launchbankbtn")).click();
//     driver.navigate().back();
//     driver.navigate().refresh();
//
//     new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Danske Bank");
//  //   driver.findElement(By.cssSelector("option[value=\"45\"]")).click();
//     driver.findElement(By.id("launchbankbtn")).click();
//     driver.navigate().back();
//     driver.navigate().refresh();
//
//     new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Handelsbanken");
//   //  driver.findElement(By.cssSelector("option[value=\"58\"]")).click();
//     boolean Error1 = driver.getPageSource().contains("temporarily unavailable");
//     if (Error1 == true)
//     {
//      System.out.print("Login unsuccessful\n");
//   //   driver.navigate().back();
//    //  driver.navigate().refresh();
//     driver.get(driver.getCurrentUrl());
//    // driver.navigate().to(driver.getCurrentUrl());
//     // driver.findElement(By.id("Contact-us")).sendKeys(Keys.F5);
//     // driver.executeScript("history.go(0)");
//     }
//     else
//     {
//
//      System.out.print("Login successful\n");
//      driver.findElement(By.id("launchbankbtn")).click();
//      driver.navigate().forward();
//     }
//
//  //  driver.findElement(By.name("loginBtn")).click();
//     driver.navigate().back();
//
//     new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Nordea Sweden");
//    // driver.findElement(By.cssSelector("option[value=\"128\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.findElement(By.name("loginBtn")).click();
//     driver.navigate().back();
//
//     new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Bank 2 Bankaktiebolag");
// //    driver.findElement(By.cssSelector("option[value=\"169\"]")).click();
//     if(driver.findElement(By.id("launchbankbtn")).isEnabled()){
//     	driver.findElement(By.id("launchbankbtn")).click();
//     	 driver.navigate().back();
//     	 driver.navigate().refresh();
//     	}
//     	else{
//     	//button is not enabled
//     	//driver.navigate().refresh();
//     		    	}
//
//     new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("SEB Sweden");
//   //  driver.findElement(By.cssSelector("option[value=\"3\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//    driver.findElement(By.name("loginBtn")).click();
//     driver.navigate().back();
//  }
//
//  @Test
///* public void testHttpsibsindex() throws Exception {
//    driver.get(baseUrl + "/internetbanking/index.form");
//    new Select(driver.findElement(By.id("environment_name"))).selectByVisibleText("AWS_STAGING_HTTPS");
//    new Select(driver.findElement(By.id("override_store_id"))).selectByVisibleText("Branded - IS34926840");
//    new Select(driver.findElement(By.id("theme"))).selectByVisibleText("buymyevoucher");
//    driver.findElement(By.id("submit_button")).click();
//    new Select(driver.findElement(By.id("selectbank"))).selectByVisibleText("Swedbank");
//    driver.findElement(By.cssSelector("option[value=\"59\"]")).click();
//    driver.findElement(By.id("launchbankbtn")).click();
//  driver.navigate().back();
// }  */
//
// @After
// public void tearDown() throws Exception {
//    //driver.quit();
//	 // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//	//capabilities.setCapability("marionette", true);
//	//WebDriver driver = new FirefoxDriver(capabilities);
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//    FileWriter w = new FileWriter("C:\\QA\\TESTRESULT\\temp.txt",true);
//
//    BufferedWriter out = new BufferedWriter(w);
//    out.newLine();
//    out.write("Testcase IB  is passd");
//    out.newLine();
//    out.write("Test date and time is:");
//    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//    //get current date time with Date()
//     Date date = new Date();
//      // Now format the date
//   String date1= dateFormat.format(date);
//    // Print the Date
//    System.out.println("Test date and time is " +date1);
//    out.write(date1);
//    out.flush();
//    out.close();
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
//}
