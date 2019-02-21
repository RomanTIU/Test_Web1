package com.gitHub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestGit extends WebDriverSettings {





    @Test
    public void testGit(){

        driver.get("https://github.com/");
        String getTitle = driver.getTitle();
        Assert.assertTrue(getTitle.equals("The world’s leading software development platform · GitHub"));

    }

    @Test
    public void testGitLogin(){
        driver.get("https://github.com/login");
        String getTitle = driver.getTitle();
        Assert.assertTrue(getTitle.equals("Sign in to GitHub · GitHub"));
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys("vip.polovei55@mail.ru");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("SimpluTestDeLogare29.");
        driver.findElement(By.name("commit")).click();
        getTitle = driver.getTitle();
        Assert.assertTrue(getTitle.equals("GitHub"));

    }


}
