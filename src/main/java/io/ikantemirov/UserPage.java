package io.ikantemirov;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.extension.page.BaseUrl;

@BaseUrl("https://vk.com/id102764")
public interface UserPage extends WebPage {

    @FindBy("(//div[contains(@class, 'post_content')])[1]")
    PostContent postContent();

    @FindBy("//div[@class='popup_box_container']")
    PopupBox popupBox();

    @FindBy("(//div[@class='left_settings'])[1]")
    MenuSettings menuSettings();
}
