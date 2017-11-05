package com.first.test;

import com.first.base.BaseTest;
import com.first.pages.LoginPage;
import com.first.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{



    @Test
    public void positiveLoginTest(){
        LoginPage loginPage = new LoginPage(webDriver);
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);

        String expectedPageTitle = "WorldAPP";
        String correctProfileName = "george.helidze@worldapp.com";

        // Open ksapi login page --- http://app-ksapi.ssstest.com
        loginPage.openLoginPage();
        //Fill up email and password
        loginPage.fillUpEmailAndPassword("george.helidze@worldapp.com","aladar74");
        //Push sign in button
        loginPage.pushSignInButton();

        webDriver.switchTo().alert().accept();

        myAccountPage.clickMyAccountButton();
        // Verify that button login displayed
        myAccountPage.waitForEditAccountButton();
        //Verify correct name on Account page

        String actualTitle = myAccountPage.getTitle();
        Assert.assertTrue(expectedPageTitle.equals(actualTitle),
                "Page title doesn't as expected: " + expectedPageTitle + "\nActual: " + actualTitle);
        Assert.assertTrue(myAccountPage.isCorrectProfileLoaded(correctProfileName),"Profile name is not as expected: ");

    }
    @Test
    public void negativeLoginTest(){
        LoginPage loginPage = new LoginPage(webDriver);
        // Open ksapi login page --- http://app-ksapi.ssstest.com
        loginPage.openLoginPage();
        //Fill up email and password
        loginPage.fillUpEmailAndPassword("george.helidze@worldapp.com","1");
        //Push sign in button
        loginPage.pushSignInButton();

        Assert.assertEquals(webDriver.switchTo().alert().getText(),"The Login ID and/or Password did not match our records.");
    }


}
