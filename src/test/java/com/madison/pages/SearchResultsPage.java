package com.madison.pages;

import com.madison.utilities.Driver;
import org.openqa.selenium.By;

public class SearchResultsPage extends BasePage{

public void selectFromResults(String productName){

    Driver.get().findElement(By.xpath("//*[text()='"+ productName+"']")).click();
}

}
