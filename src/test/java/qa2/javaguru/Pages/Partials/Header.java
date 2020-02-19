package qa2.javaguru.Pages.Partials;

import org.openqa.selenium.By;
import qa2.javaguru.Utils.CommonApproach.Identificator;
import qa2.javaguru.elements.Button;
import qa2.javaguru.elements.Icon;
import qa2.javaguru.elements.Label;

public interface Header {

    default Label topEmail() {
        return Label.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.lftflot > h6:nth-child(2)"));
    }

    default Label topPhone() {
        return Label.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.lftflot > h6:nth-child(3)"));
    }

    default Button topAskQuestionButton() {
        return Button.get(By.className("inlinelb topbar-contact"));
    }

    @Identificator(id = "C001_moodle_link_button")
    default Button topMoodleLinkButton() {
        return Button.get(By.cssSelector("#wrap > section.top-bar > div > div.top-links.rgtflot > a:nth-child(2)"));
    }

    @Identificator(id = "C001_language_link_button")
    default Button topLanguageLinkButton() {
        return Button.get(By.cssSelector("#top_lang_bar > li > a"));
    }

    @Identificator(id = "C001_icon_facebook")
    default Icon topIconInstagram() {
        return Icon.get(By.cssSelector("div.top-links.lftflot > div > a.facebook > i"));
    }

    @Identificator(id = "C001_icon_linkedin")
    default Icon topIconLinkedIn() {
        return Icon.get(By.cssSelector("div.top-links.lftflot > div > a.linkedin > i"));
    }

}
