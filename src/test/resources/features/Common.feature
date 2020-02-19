Feature: Tests for JavaGuru website: Common elements

  Scenario: TEST_001. Check RU header and menu elements
	When I navigate to JAVAGURU.LV website
	And I see 'MENU_JAVAGURU_LOGO' element on the 'S100' page
	Then I see following elements on the 'S100' page
	  | ELEMENT                | LABEL                  |
	  | HEADER_EMAIL_LABEL     |                        |
	  | HEADER_PHONE_LABEL     |                        |
	  | HEADER_MOODLE_BUTTON   | @/HEADER/RU/moodle     |
	  | HEADER_LANGUAGE_BUTTON | @/HEADER/RU/language   |
	  | HEADER_QUESTION_BUTTON | @/HEADER/RU/question   |
	  | HEADER_ICON_FACEBOOK   |                        |
	  | HEADER_ICON_LINKEDIN   |                        |
	  | MENU_COURSES_OPTION    | @/MENU/RU/courses      |
	  | MENU_TIMETABLE_OPTION  | @/MENU/RU/timetable    |
	  | MENU_REGISTER_OPTION   | @/MENU/RU/registration |
	  | MENU_FAQ_OPTION        | @/MENU/RU/FAQ          |
	  | MENU_NEWS_OPTION       | @/MENU/RU/news         |
	  | MENU_ABOUT_US_OPTION   | @/MENU/RU/aboutUs      |