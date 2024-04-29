Feature: AddCar

  @addCar
  Scenario: Add auto with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Ok button
    And User clicks Let the car work
    And User enters Location data
    And User enters Car details
    And User enters the text About
    And User upload Photos of car
    Then User clicks Submit button

