@Java2 @registration
Feature: Tests for JavaGuru website: Java2 page and registration form

  Scenario Outline: As an end user I am able to register in Java 2 course registration form
    Given User is on the 'www.javaguru.lv' page
    When User opens Java 2 course
    And User opens Java 2 registration form
    And User switches tabs
    Then User fills Java 2 registration form with data
      | First Name           | <first_name> |
      | Last Name            | <last_name>  |
      | Contact Phone        | <phone>      |
      | E-mail               | <email>      |
      | Discount coupon code | <discount>   |

    Examples:
      | first_name | last_name | phone    | email             | discount |
      | John       | Doe       | 77777777 | jd@mailinator.com | 66613666 |
      | John       | Kramer    | 38383838 | jk@mailinator.com | 25252525 |