package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_Test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        //Find and put text to the element
        WebElement textInput = driver.findElement(By.id("my-text-id"));
        textInput.sendKeys("Sample Text in TextInput field");

        WebElement passwordInput = driver.findElement(By.name("my-password"));
        passwordInput.sendKeys("MyPassword-123");

        WebElement textArea = driver.findElement(By.name("my-textarea"));
        textArea.sendKeys("This is sample text in Text Area");

        driver.quit();
    }
}
