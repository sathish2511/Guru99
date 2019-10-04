
@tag
Feature: Title of your feature
  I want to use this template for my feature file



  @tag2
  Scenario Outline: Title of your scenario outline
    Given I user in Guru99 Telecom page
    And The user clicks the Add customer and click button
    When The user fill the add customer name "<name1>","<name2>","<name3>","<name4>","<name5>"
    Then The user navigate next page

    Examples: 
      | name1               | name2   | name3                             |name4           |name5      |
      | sathish             |     s   |    sathishsampath2511@gmail.com   |chennai         |   123456  |
      | Karthick            |    k    | karthick22@gmail.com              |Tamilnadu       |  9876567         |
      
     
