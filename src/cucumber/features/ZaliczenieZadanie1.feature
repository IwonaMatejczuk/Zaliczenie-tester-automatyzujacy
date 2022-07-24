Feature: Zadanie zaliczeniowe 1


  Scenario Outline: Successful test
    Given Browser with open page at address https://mystore-testlab.coderslab.pl/index.php
    When Log in as an existing user
    And Address clicked
    And Create new address clicked
    And New address form filled with <Alias>, <Address> , <City>, <Postal Code>, <Phone>
    Then Checked the added address
    Examples:
       |Alias   |Address         | City  | Postal Code |Phone     |
       |Test    |ul. Testowa 1/1 |Test   |03-123       |123123123 |


