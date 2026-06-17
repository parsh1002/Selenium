package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args )
    {
        // ChromeOptions options = new ChromeOptions();

        // options.addArguments("--headless=new");
        // options.addArguments("--no-sandbox");
        // options.addArguments("--diable-dev-shm-usage");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        driver.quit();
        
        
    }
}
