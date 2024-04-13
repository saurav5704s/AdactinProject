package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestClass {


	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Hello");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Hello@123");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
