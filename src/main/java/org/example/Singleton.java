package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Singleton {
    private static Singleton singleton;
    private static WebDriver driver;

    private Singleton(){

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.amazon.com");
        driver.close();

    }

    public static Singleton getSingleton(){

        if(singleton==null)
            singleton = new Singleton();

        return singleton;
    }

    public static WebDriver getDriver(){

        return driver;
    }



}
