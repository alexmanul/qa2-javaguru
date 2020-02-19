Feature: Tests for JavaGuru website: Common elements

  Scenario: CMN11. Check RU menu elements
	When I navigate to JAVAGURU.LV website
	And I see 'MENU_JAVAGURU_LOGO' element on the 'S100' page
	Then I see following elements on the 'S100' page
	  | ELEMENT               | LABEL                  |
	  | MENU_COURSES_OPTION   | @/MENU/RU/courses      |
	  | MENU_TIMETABLE_OPTION | @/MENU/RU/timetable    |
	  | MENU_REGISTER_OPTION  | @/MENU/RU/registration |
	  | MENU_FAQ_OPTION       | @/MENU/RU/FAQ          |
	  | MENU_NEWS_OPTION      | @/MENU/RU/news         |
	  | MENU_ABOUT_US_OPTION  | @/MENU/RU/aboutUs      |

  Scenario: CMN12. Check LV menu elements
	When I navigate to JAVAGURU.LV website
#	And I click on 'C001_language_link_button' element on the 'S100' screen
#	Then I see following elements on the 'MENU' screen
#	  | IDENTIFICATOR | LABEL                  |
#	  | S100_MENU_    | @/MENU/LV/trainings    |
#	  | S100_MENU_    | @/MENU/LV/timetable    |