Feature: Tests for JavaGuru website: PHP page and registration form

  Scenario Outline: PHP course registration form
    Given User is on the 'www.javaguru.lv' page
    When User opens PHP course
    And User opens PHP registration form
    And User switches tabs
    Then User fills PHP registration form with data
      | First Name          | <first_name> |
      | Last Name           | <last_name>  |
      | Contact Phone       | <phone>      |
      | E-mail              | <email>      |
      | Programming skills  | <skills>     |
      | Personal PC         | <laptop>     |
      | Your adviser        | <adviser>    |
      | Comments, questions | <comments>   |

    Examples:
      | first_name | last_name | phone    | email             | skills | laptop | adviser | comments           |
      | John       | Doe       | 77777777 | jd@mailinator.com | No     | Yes    | Dmitry  | Delete this please |
      | John       | Kramer    | 38383838 | jk@mailinator.com | Yes    | No     | Dmitry  | The Saw is the Law |
    