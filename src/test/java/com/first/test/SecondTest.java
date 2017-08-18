package com.first.test;

import com.first.base.BaseTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void loginToServer() {
        //OPen app-ksapi.ssstest.com
        webDriver.get("http://app-ksapi.ssstest.com");
        System.out.println("Api server opened.Test passed");


    }
}
