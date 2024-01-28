package com.virgingames.pages;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public void getCurrentUrl() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        Assert.assertEquals(actualUrl, expectedUrl);
        log.info("verifying Homepage Url");
    }
    @CacheLookup
    @FindBy(xpath = "(//label[@class='dialog_button'])[2]")
    WebElement acceptCookiesButton;

    public void clickOnAcceptCookiesButton() {
        clickOnElement(acceptCookiesButton);
        log.info("Clicking on accept cookies button : " + acceptCookiesButton.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledNavigationMenuWrapper-sc-v46bks-0 jLmDjy']/ul/li")
    List<WebElement> topMenuList;
    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                menu.click();
                break;
            }
        }
    }
}




