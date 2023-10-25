@Cart
Feature: CartPage

  @positive
  Scenario: User checkout item
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Cart icon
    Then User already on Cart page
    And User click checkbox on selected item
    And User verify total price
    And User click checkout button
    Then User already on payment page

  @positive
  Scenario: User remove item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on add to cart icon
    And User click on Cart icon
    Then User already on Cart page
    And User click remove item icon
    Then pop up with message "Delete has been successful" has shown

  @positive
  Scenario: User add more quantity item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Cart icon
    Then User already on Cart page
    And User click plus icon for adding more quantity product
    Then quantity product change value