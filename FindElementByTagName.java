import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.*;
import java.io.BufferedReader;


public class FindElementByTagName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://data.worldbank.org/country");
        driver.manage().window().maximize();


        driver.findElement(By.className("alphabet")).click();
        driver.findElement(By.linkText("G")).click();



    }
}

