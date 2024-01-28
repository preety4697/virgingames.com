package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlineSlotsPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnlineSlotsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[1]")
    WebElement onlineSlotsText;
    public String getOnlineSlotsText(){
        log.info("Getting Online Slots text : " + onlineSlotsText.toString());
        return getTextFromElement(onlineSlotsText);
    }
}
