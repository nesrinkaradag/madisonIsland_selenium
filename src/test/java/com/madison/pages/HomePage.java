package com.madison.pages;

import com.madison.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    public void navigateToSubMenu(String menu, String sub) {

        String tabLocator = "//*[text()='" + menu + "'][@class='level0 has-children']";
        String moduleLocator = "//*[text()='" + sub+ "'][contains(@class, 'level1')]";
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath(tabLocator))).perform();
        Driver.get().findElement(By.xpath(moduleLocator)).click();

    }
}
