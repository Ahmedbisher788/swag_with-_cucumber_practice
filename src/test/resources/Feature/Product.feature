Feature: add and remove item in product page

  Scenario: add item to cart and validate quantity
    Given user enter "standard_user" and "secret_sauce" and enter login
    When user add back page item to cart
    Then quantity should present one
    And remove item from cart

    Scenario: add two item to cart and validate quantity
      Given user enter "standard_user" and "secret_sauce" and enter login
      When user add back page item to cart
      And user add T.shirt to car
      Then quantity should present two

