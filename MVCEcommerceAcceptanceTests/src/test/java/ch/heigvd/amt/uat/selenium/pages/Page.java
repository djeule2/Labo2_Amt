package ch.heigvd.amt.uat.selenium.pages;

import org.openqa.selenium.WebDriver;


public abstract class Page {

  final WebDriver driver;

  public Page(WebDriver driver) {
    this.driver = driver;
  }

}
