Feature: Login
 @sanity   
Scenario: successful login with valid credentials
     Given user launch chrome browser
    When user opens URL "www.fb.com"
    And user enters Email as "123456" and Password as "123456"
    And click on login 
    Given user click on Cities module link 
    And user click on add button 
    When user give cityname as "narisp22a2tnam" 
    When user give  citycode as "77429"
    And select district 
    Then click on save 
    And Retrive successMsg
    And close browser
