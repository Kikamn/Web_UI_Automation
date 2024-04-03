@Home
Feature: Home

  @image-product
  Scenario: User can see image product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user can see image product

  @price-product
  Scenario: user can see price product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user can see price product

  @button-addCart
  Scenario: User can addcart product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When User Click Add to cart button
    Then user add product in keranjang

  @buttn-remove
  Scenario: User can remome product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And User Click Add to cart button
    When User Click remove button
    Then User can remove product in keranjang

  @filter-product
  Scenario: User can filter product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When user clik filter
    Then User can chose filter product

    @burger-button
    Scenario: User can click button burger menu
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      When user click burger menu button
      Then User see menu