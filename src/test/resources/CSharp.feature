Feature: Tests for JavaGuru website: C# page and registration form

  Scenario Outline: As an end user I am able to register in C# course registration form
    Given User is on the 'www.javaguru.lv' page
    When User opens C# course
    And User opens C# registration form
    And User switches tabs
    Then User fills C# registration form with data
      | First Name           | <first_name> |
      | Last Name            | <last_name>  |
      | Contact Phone        | <phone>      |
      | E-mail               | <email>      |
      | Programming skills   | <skills>     |
      | Comments, questions  | <comments>   |
      | Discount coupon code | <discount>   |

    Examples:
      | first_name | last_name | phone    | email             | skills | comments           | discount |
      | John       | Doe       | 77777777 | jd@mailinator.com | No     | Delete this please | 66613666 |
      | John       | Kramer    | 38383838 | jk@mailinator.com | Yes    | The Saw is the Law | 25252525 |