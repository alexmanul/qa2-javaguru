@Java1 @registration
Feature: Tests for JavaGuru website: Java1 page and registration form

  Scenario Outline: As an end user I am able to register in Java 1 course registration form
    Given User is on the 'www.javaguru.lv' page
    When User opens Java 1 course
    And User opens Java 1 registration form
    And User switches tabs
    Then User fills Java 1 registration form with data
      | First Name           | <first_name> |
      | Last Name            | <last_name>  |
      | Contact Phone        | <phone>      |
      | E-mail               | <email>      |
      | Group                | <group>      |
      | Programming skills   | <skills>     |
      | Personal PC          | <laptop>     |
      | Your adviser         | <adviser>    |
      | Comments, questions  | <comments>   |
      | Discount coupon code | <discount>   |

    Examples:
      | first_name | last_name | phone    | email               | group        | skills | laptop | adviser | comments           | discount |
      | John       | Doe       | 77777777 | jd@mailinator.com | RU (вторник) | No     | Yes    | Dmitry  | Delete this please | 66613666 |
      | John       | Kramer    | 38383838 | jk@mailinator.com | RU (суббота) | Yes    | No     | Dmitry  | The Saw is the Law | 25252525 |