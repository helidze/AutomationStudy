package com.first.pages;

import com.first.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePageObject<MyAccountPage> {

    private By myAccountButton = By.xpath(".//*[@id='topNav']/ul/li[3]/a");
    private By editAccountButton = By.xpath(".//*[@id='editProfile']");
    private By profileContactNameText = By.xpath("//*[@id=\"mainIncludeContainer\"]/table/tbody/tr/td[1]/div[1]/table/tbody/tr[1]/td");
    private By logoutButton = By.linkText("Logout");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountButton() {
        click(myAccountButton);
    }

    public void waitForEditAccountButton() {
        waiForVisabilityOf(editAccountButton);
    }

    public boolean isCorrectProfileLoaded(String correctProfileName) {
        if (getText(profileContactNameText).equals(correctProfileName)) {
            return true;
        }
        return false;
    }
    public void clickLogout(){
        click(logoutButton);
    }
}
