package com.first.test;

import com.first.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {


    @Test
    public void openBrowserTest() {

        //OPen app-ksapi.ssstest.com
        webDriver.get("http://app-ksapi.ssstest.com");
        System.out.println("Api server opened.Test passed");


    }


}
