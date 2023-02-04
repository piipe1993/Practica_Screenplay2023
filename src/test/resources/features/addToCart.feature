@cart
Feature:Add a particular product from list

  Scenario Outline: Add individual product

    Given Andres Enters of the SawgLab website
    When he sends the following credentials <user> and <password>
    And he selects a product <product> from the list to the shopping cart
    Then He should see the <product> and price inside the shopping cart
    Examples:
      | user          | password     | product               |
      | standard_user | secret_sauce | Sauce Labs Bike Light |