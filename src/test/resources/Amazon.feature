#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: customer want to verify that count of product
    Given customer want to launch Browser
    And  customer give amazon URL
    And customer in amazon website
    When customer type puma shoe in search box
    And  click the search box
    Then customer can see the product count
    

  @tag2
  Scenario Outline: customer want to verify product added in cart
    Given customer want to launch Browser
    And customer give amazon URL
    And customer in amazon website
    And customer type fastrack mens watch in search box
    And click the search button 
    And click the product
    When customer click cart button
    And Search fastrack women watch in search box
    And clik the search button
    And customer click cart button
    Then customer can see more product availabe in cart
    
    @tag3
    Scenario Outline: verify cas on delivery option is wroking fine
    Given customer want to launch Browser
    And customer give amazon URL
    And customer in amazon website
    And customer type MI phone in search box
    And click the search button 
    And choose the product 
    When customer click pay on Delivery option
    Then customer can able to view pay on Delivery option
    
    @tag4
    Scenario Outline: verify cancels submit request is wroking fine
    Given customer want to launch Browser
    And customer give amazon URL
    And customer in amazon website
    And customer want to fill the delivery address
    When Customer want to cancel the delivery address
    Then Customer can able to see the cancalletion wroking finde 
     
    

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
