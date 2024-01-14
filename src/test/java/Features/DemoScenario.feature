Feature: AppiumLearnings

  @Regression1
  Scenario Outline: User Selects highest amount product and checkout
    Given user open the General Store application
    When user selects the country "<country>" from the dropdown list
    And enter the user name as "<name>"
    Then user selects the gender as "<gender>"
    When user click on Lets Shop button
    Then user should be redirected to Products page


    Examples:
      | name        | country | gender |
      | Abdul Azeem | India   | Male   |