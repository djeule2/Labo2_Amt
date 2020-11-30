package ch.heigvd.amt.uat.selenium.pages;

import org.openqa.selenium.WebDriver;


public class UglyServletPage extends AbstractEcommercePage {

  public UglyServletPage(WebDriver driver) {
    super(driver);

    // Check that we're on the right page.
    if (!"Ugly Servlet".equals(driver.getTitle())) {
      throw new IllegalStateException("This is not the correct page");
    }
  }
  
}
