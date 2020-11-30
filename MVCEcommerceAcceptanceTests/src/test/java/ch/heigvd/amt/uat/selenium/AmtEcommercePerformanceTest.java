package ch.heigvd.amt.uat.selenium;

import ch.heigvd.amt.uat.selenium.pages.HomePage;
import ch.heigvd.amt.uat.selenium.pages.LoginPage;
import io.probedock.client.annotations.ProbeTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmtEcommercePerformanceTest {

  private String baseUrl = "http://localhost:8080/e-commerce/checkout";
  private WebDriver driver;

  @Before
  public void openBrowser() {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
  }

  @Test
  @ProbeTest(tags = "WebUI")
  public void itShouldNotBePossibleToSigninWithAnInvalidEmail() {
    driver.get(baseUrl);
    LoginPage loginPage = new LoginPage(driver);
    loginPage.typeUserName("this is not a valid user name");
    loginPage.typePassword("any password");
    loginPage.submitFormExpectingFailure();
  }
  
  @Test
  @ProbeTest(tags = "WebUI")
  public void successfulSigninShouldBringUserToHomePage() {
    driver.get(baseUrl);
    LoginPage loginPage = new LoginPage(driver);
    loginPage.typeUserName("olivier");
    loginPage.typePassword("any password");
    HomePage homePage = (HomePage)loginPage.submitForm(HomePage.class);
  }

  @Test
  @ProbeTest(tags = "WebUI")
  public void aUserTryingToGetToAboutPageShouldBeRedirectedThereAfterSignin() {
    driver.get(baseUrl + "/e-commerce/indexe");
    LoginPage loginPage = new LoginPage(driver);
    loginPage.typeUserName("olivier");
    loginPage.typePassword("any password");

  }

  @Test
  @ProbeTest(tags = "WebUI")
  public void aUserShouldBeAbleToVisitAllPagesAfterSignin() {
    driver.get(baseUrl);
    LoginPage loginPage = new LoginPage(driver);
    loginPage.typeUserName("olivier ");
    loginPage.typePassword("any password");
   // HomePage homePage = (HomePage)loginPage.submitForm(HomePage.class);

  }

  @After
  public void closeBrowser() {
    driver.close();
  }
}
