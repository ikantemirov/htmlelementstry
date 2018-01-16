package io.ikantemirov;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface PopupBox extends HtmlElement {

    @FindBy(".//div[@class='box_x_button']")
    HtmlElement xButton();

    @FindBy(".//button[@class='flat_button']")
    HtmlElement saveButton();

    @FindBy("(.//a[@class='summary_tab2'])[1]")
    HtmlElement generalTab();

    @FindBy("(.//a[@class='summary_tab2'])[2]")
    HtmlElement groupsTab();

    @FindBy("(.//a[@class='summary_tab2'])[3]")
    HtmlElement appsTab();
}
