package com.first.pages;

import com.first.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject<LoginPage> {
    private  static final String URL = "https://app.keysurvey.com";

    private By emailField = By.xpath("//input[@id='login']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signIn = By.xpath("//input[@id='loginButton']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage(){
        getPage(URL);
    }

    public void fillUpEmailAndPassword(String email, String password){
        type(email, emailField);
        type(password, passwordField);
    }

    public void pushSignInButton(){
        click(signIn);
    }


}
