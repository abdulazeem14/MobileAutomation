Feature: AppiumLearnings2

  @Regression
  @AddProductToCart
  Scenario Outline: User Selects lowest amount product and checkout
    Given user open the General Store application
    When user selects the country "<country>" from the dropdown list
    And enter the user name as "<name>"
    Then user selects the gender as "<gender>"
    When user click on Lets Shop button
    Then user should be redirected to Products page
    And user select "<product>" product and add to cart


    Examples:
      | name        | country | gender | product            |
      | Abdul Azeem | India   | Male   | Air Jordan 9 Retro |