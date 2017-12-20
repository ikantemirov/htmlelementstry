package io.ikantemirov;

import io.qameta.htmlelements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthorizationPageTest {

    private WebDriver driver = new ChromeDriver();
    private WebPageFactory factory = new WebPageFactory();
    public AuthorizationPage page = factory.get(driver, AuthorizationPage.class);
    

}
