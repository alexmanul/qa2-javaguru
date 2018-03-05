Feature: Tests for JavaGuru website: QA page and registration form

  Scenario Outline: As an end user I am able to register in QA course registration form
    Given User is on the 'www.javaguru.lv' page
    When User opens QA course
    And User opens QA registration form
    And User switches tabs
    Then User fills QA registration form with data
      | First Name           | <first_name> |
      | Last Name            | <last_name>  |
      | Contact Phone        | <phone>      |
      | E-mail               | <email>      |
      | Course               | <course>     |
      | Programming skills   | <skills>     |
      | Personal PC          | <laptop>     |
      | Your adviser         | <adviser>    |
      | Comments, questions  | <comments>   |
      | Discount coupon code | <discount>   |

    Examples:
      | first_name | last_name | phone    | email             | course | skills | laptop | adviser | comments           | discount |
      | John       | Doe       | 77777777 | jd@mailinator.com | QA1    | No     | Yes    | Dmitry  | Delete this please | 66613666 |
      | John       | Kramer    | 38383838 | jk@mailinator.com | QA2    | Yes    | No     | Dmitry  | The Saw is the Law | 25252525 |