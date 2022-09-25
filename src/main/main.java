package main;

import org.openqa.selenium.Webdriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main{
    public static void main(String[] args) {
        Webdriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.quit();
    }


}