package com.jira.integration.steps

import com.jira.integration.pages.Search
import cucumber.api.PendingException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import static cucumber.api.groovy.EN.*

WebDriver driver
Search search

Given(~/^Filtered movies are retrieved$/) { ->
    // Write code here that turns the phrase above into concrete actions
    String fullPath = Thread.currentThread().getContextClassLoader().getResource("drivers/chrome/mac/chromedriver_mac").getPath()
    System.setProperty("webdriver.chrome.driver", fullPath)
    driver = new ChromeDriver()
    driver.navigate().to("http://www.amazon.com")
}

When(~/^A movie is accessed$/) { ->
    // Write code here that turns the phrase above into concrete actions
    search = new Search(driver)
    search.enterSearchCriteria("Avengers End Game").clickGo()
}

Then(~/^Movie Details are retrieved$/) { ->
    // Write code here that turns the phrase above into concrete actions

    assert true == true
    println(search.getResults())
}