Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error is displayed
    And User quites browser
    Examples:
      | email                | password     |
      | nchalova93@gmail.com | Chalova2402  |
      | nchalova93@gmail.com | Chalovallll@ |
      | nchalova93@gmail.com | chalova2402@ |
      | nchalova93@gmail.com | C2222222402@ |