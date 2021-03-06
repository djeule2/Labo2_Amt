package ch.heigvd.amt.uat.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * This class is used to test the "Home" page in the MVCDemo app.
 * 
 * @author Olivier Liechti
 */
public class HomePage extends AbstractEcommercePage {

  public HomePage(WebDriver driver) {
    super(driver);

    // Check that we're on the right page.
    if (!"Welcome".equals(driver.getTitle())) {
      throw new IllegalStateException("This is not the correct page");
    }
  }

  
}
