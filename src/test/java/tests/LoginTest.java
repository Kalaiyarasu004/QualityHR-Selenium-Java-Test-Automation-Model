package tests;

import base.BaseTest;

import org.testng.annotations.Test;

import pages.LoginPage;

import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(

                ConfigReader.getProperty("username"),

                ConfigReader.getProperty("password")
        );
    }
}