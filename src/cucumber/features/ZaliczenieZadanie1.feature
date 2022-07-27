Feature: Zadanie zaliczeniowe 1


  Scenario Outline: Successful test
    Given Browser with open page at address https://mystore-testlab.coderslab.pl/index.php
    When Log in as an existing user
    And Address clicked
    And Create new address clicked
    And New address form filled with <Alias>
    And Add new <Address>
    And Type <City>
    And Enter the <Post Code>
    And Choose <Country>
    And Complete <Phone>
    And Save clicked
    Then Checked the added address

    Examples:
       |Alias   |Address          | City   | Post Code   |Country       |   Phone       |
       |Adres   |ul. Kwiatowa     |Sopot   |03-123       |United Kingdom|123 123 123 |



