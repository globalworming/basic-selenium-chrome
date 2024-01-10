package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
  @Test
  public void shouldAnswerWithTrue() {
      ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://example.com");
        driver.navigate().to("https://google.com");
        driver.quit();
  }

}
