package testHindu;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestHindu {

	public static void main(String[] args) {
		
	}
	
	public void webdrivertest() {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		try {
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//Verify the navigated page.using if statement
				String title=driver.getTitle();
				System.out.println(title);
				if(title.equals("Google"))
					{
					System.out.println("Title is correct");
				}
				else
				{
					System.out.println("Title is wrong");
				}
				//Verify the navigated url using if statement
				String url = driver.getCurrentUrl();
				System.out.println(url);
				if(url.equals("https://www.google.com/"))
					{
					System.out.println("url is correct");
				}
				else
				{
					System.out.println("url is wrong");
				}
				//verify url and title using alert.
				Assert.assertEquals("https://www.google.com/",url);
				Assert.assertEquals("Google", title);
			
				//Click the signin button
			
			  driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
			  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(
			  "udemotest@gmail.com");
			  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).
			  click(); Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))
			  .sendKeys("Colonel@2210"); //click on next after providing the password
			  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click(
			  );
			  Thread.sleep(3000);
			
			  //verify the user login
			  driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[3]/div[1]/a")).click();
			  WebElement userElement = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[3]/div[2]/div[1]/div/div[1]"));
			  String userString = userElement.getText();
			  
			  Assert.assertEquals("demotest user", userString);
			 
			 
			
			/*
			 * Thread.sleep(3000);
			 * 
			 * //Logout //Click on Account info
			 * driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[3]/div[1]/a"
			 * )).click(); //Click on sign out button
			 * driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
			 */
			 
				
				//serach something in search field
			/*
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("w3schools")
			 * ; // click on the google search button
			 * driver.findElement(By.name("btnK")).click(); //Click on the search link
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click(); //click on
			 * turtorials. driver.findElement(By.id("navbtn_tutorials")).click();
			 */
				
				//driver.close();
			}
		catch(Exception ex){
			System.out.println("Test Failed");
			ex.printStackTrace();
		}
	}

}
