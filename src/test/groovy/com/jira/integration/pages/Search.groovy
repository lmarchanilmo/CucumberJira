package com.jira.integration.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class Search extends BasePage{

    By searchBox = By.id('twotabsearchtextbox')
    By searchButton = By.xpath('//input[@type="submit" and @value="Go"]')
    By results = By.xpath('//div[@data-component-type="sp-sponsored-result"]//h2//span')

    Search(WebDriver driver){
        super(driver)
    }

    Search enterSearchCriteria(String value){
        driver.findElement(searchBox).sendKeys(value)
        return this
    }

    Search clickGo(){
        driver.findElement(searchButton).click()
        return this
    }

    List<String> getResults(){
        List<String> resultsAsString = []
        driver.findElements(results).each {
            resultsAsString<< it.getText()
        }

        return resultsAsString
    }

}
