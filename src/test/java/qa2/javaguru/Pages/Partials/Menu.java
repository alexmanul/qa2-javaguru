package qa2.javaguru.Pages.Partials;

import org.openqa.selenium.By;
import qa2.javaguru.Utils.CommonApproach.Identificator;
import qa2.javaguru.elements.Button;
import qa2.javaguru.elements.Icon;

public interface Menu {

    @Identificator(id = "MENU_JAVAGURU_LOGO")
    default Icon logo() {
        return Icon.get(By.cssSelector("#header > div > div.col-md-3.col-sm-3.logo-wrap > div > a:nth-child(1) > img"));
    }

    @Identificator(id = "MENU_COURSES_OPTION")
    default Button menu_courses() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-10223"));
    }

//    @Identificator(id = "MENU_WORKSHOPS_OPTION")
//    default Button menu_workshops() {
//        return Button.get(By.cssSelector("ul#nav>li#menu-item-10223"));
//    }

    @Identificator(id = "MENU_TIMETABLE_OPTION")
    default Button menu_timetable() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-10578"));
    }

    @Identificator(id = "MENU_REGISTER_OPTION")
    default Button menu_register() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-10304"));
    }

    @Identificator(id = "MENU_FAQ_OPTION")
    default Button menu_faq() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-10235"));
    }

    @Identificator(id = "MENU_NEWS_OPTION")
    default Button menu_news() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-10212"));
    }

    @Identificator(id = "MENU_ABOUT_US_OPTION")
    default Button menu_about_us() {
        return Button.get(By.cssSelector("ul#nav>li#menu-item-12320"));
    }


}