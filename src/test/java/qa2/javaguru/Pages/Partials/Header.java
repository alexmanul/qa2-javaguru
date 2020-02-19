package qa2.javaguru.Pages.Partials;

import org.openqa.selenium.By;
import qa2.javaguru.Utils.CommonApproach.Identificator;
import qa2.javaguru.elements.Button;
import qa2.javaguru.elements.Icon;
import qa2.javaguru.elements.Label;

public interface Header {

    @Identificator(id = "HEADER_EMAIL_LABEL")
    default Label topEmail() {
        return Label.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.lftflot > h6:nth-child(2)"));
    }

    @Identificator(id = "HEADER_PHONE_LABEL")
    default Label topPhone() {
        return Label.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.lftflot > h6:nth-child(3)"));
    }

    @Identificator(id = "HEADER_QUESTION_BUTTON")
    default Button topAskQuestionButton() {
        return Button.get(By.cssSelector("a.inlinelb.topbar-contact"));
    }

    @Identificator(id = "HEADER_MOODLE_BUTTON")
    default Button topMoodleLinkButton() {
        return Button.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.rgtflot > a:nth-child(2)"));
    }

    @Identificator(id = "HEADER_LANGUAGE_BUTTON")
    default Button topLanguageLinkButton() {
        return Button.get(By.cssSelector("#top_lang_bar > li > a"));
    }

    @Identificator(id = "HEADER_ICON_FACEBOOK")
    default Icon topIconInstagram() {
        return Icon.get(By.cssSelector("div.top-links.lftflot > div > a.facebook > i"));
    }

    @Identificator(id = "HEADER_ICON_LINKEDIN")
    default Icon topIconLinkedIn() {
        return Icon.get(By.cssSelector("div.top-links.lftflot > div > a.linkedin > i"));
    }

}
